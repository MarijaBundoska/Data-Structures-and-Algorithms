//In a mystical card game, each card embodies a creature with a specific type (int type), a health value (int health), and a magic power value (int magicPower). 
//The significance of a card is determined by the product of its health and magic power values.
//Two sorcerers decide to challenge each other in a duel, each with their own deck of cards. 
//The decks are represented as two single linked lists. In the first list, we keep the cards of the first sorcerer, 
//and in the second list, we keep the cards of the second sorcerer. Initially, both sorcerers have exactly 8 cards each.

//At the very beginning of the duel, the rules require that the first sorcerer gives their best card to the other sorcerer, so that the second sorcerer takes that card and has to put it in the middle of their deck of cards. 
//This means that we need to remove (delete) the best card from the list that keeps the cards of the first sorcerer and to add that card in the middle of the list that keeps the cards of the second sorcerer.
//Input: In each row of input we have the data for one card, separated with space, in the format type health magicPower. 
//First we have the cards of the first sorcerer, and after that follow the cards for the second sorcerer.


// Во една мистична игра со карти, секоја карта претставува суштество со одреден тип (int type), вредност за здравје (int health) и вредност за магична моќ (int magicPower). 
// Значењето (важноста) на картата се одредува како производ од нејзиното здравје и нејзината магична моќ.

// Двајца волшебници одлучуваат да се предизвикаат на дуел, секој со своја шпил карти. 
// Шпилови со карти се претставени како две еднострано поврзани листи (Single Linked Lists). Во првата листа ги чуваме картите на првиот волшебник, а во втората листа ги чуваме картите на вториот волшебник. На самиот почеток, двајцата волшебници имаат точно по 8 карти.

// На самиот почеток од дуелот, правилата бараат првиот волшебник да му ја даде својата најдобра карта на вториот волшебник, така што вториот волшебник ја зема таа карта и мора да ја стави во средината на својот шпил. 
// Ова значи дека треба да ја отстраните (избришете) најдобрата карта од листата што ги чува картите на првиот волшебник и да ја додадете таа карта во средината на листата што ги чува картите на вториот волшебник.

// Влез: Во секој ред од влезот се дадени податоците за една карта, одделени со празно место, во форматот `type health magicPower`. 
// Прво се дадени картите на првиот волшебник, а потоа следуваат картите за вториот волшебник.

//Example:
//Input:
//84 44 87
//79 9 67
//26 2 81
//57 91 59
//45 92 8
//61 52 95
//4 68 56
//55 97 80
//10 99 4
//13 84 28
//64 6 90
//70 37 27
//93 57 23
//60 30 100
//14 49 36
//50 65 12

//Output:
//84 79 26 57 45 61 4
//10 13 64 70 55 93 60 14 50


package Mari;
import java.util.Scanner;


class Card{
	private int type;
	private int health;
	private int magicPower;
	
	
	public Card(int type, int health, int magicPower) {
		this.type = type;
		this.health = health;
		this.magicPower = magicPower;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getMagicPower() {
		return magicPower;
	}
	
	public void setMagicPower(int magicPower) {
		this.magicPower = magicPower;
	}
	
	public int significance() {
		return health * magicPower;
	}
	
	@Override
	public String toString() {
		return String.valueOf(type);
	}
}

class SLLNode<E>{
	protected E element;
	protected SLLNode<E> succ;
	
	public SLLNode(E elem, SLLNode<E> succ) {
		this.element = elem;
		this.succ = succ;
	}
	
	@Override
	public String toString() {
		return element.toString();
	}
}
class SLL<E>{
	private SLLNode<E> first;
	
	public SLL() {
		this.first = null;
	}
	
	void deleteList() {
		first = null;
	}
	
	public int size() {
		int ret;
		if(first != null) {
			SLLNode<E> tmp = first;
			ret = 1;
			while(tmp.succ != null) {
				tmp = tmp.succ;
				ret++;
			}
			return ret;
		}else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		String ret = new String();
		if(first != null) {
			SLLNode<E> tmp = first;
			ret += tmp;
			while(tmp.succ != null) {
				tmp = tmp.succ;
				ret += " "+tmp;
			}
		}else
			ret = "Empty list!";
		return ret;
	}
	
	
	public void insertFirst(E o) {
		SLLNode<E> ins = new SLLNode<E>(o, first);
		first = ins;
	}
	
	public void insertAfter(E o, SLLNode<E> node) {
		if(node != null) {
			SLLNode<E> ins = new SLLNode<E>(o, node.succ);
			node.succ = ins;
		}else {
			System.out.println("The given node is null!");
		}
	}
	
	public void insertBefore(E o, SLLNode<E> before) {
		if(first != null) {
			SLLNode<E> tmp = first;
			if(first == before) {
				this.insertFirst(o);
				return;
			}
			while(tmp != null && tmp.succ != before)
				tmp = tmp.succ;
			if(tmp.succ == before) {
				SLLNode<E> ins = new SLLNode<E>(o, before);
				tmp.succ = ins;
			}else {
				System.out.println("The element doesn't exist in the list.");
			}
		}else {
			System.out.println("The list is empty.");
		}
	}
	
	public void insertLast(E o) {
		if(first != null) {
			SLLNode<E> tmp = first;
			while(tmp.succ != null)
				tmp = tmp.succ;
			SLLNode<E> ins = new SLLNode<E>(o, null);
			tmp.succ = ins;
		}else {
			insertFirst(o);
		}
	}
	
	public E deleteFirst() {
		if(first != null) {
			SLLNode<E> tmp = first;
			first = first.succ;
			return tmp.element;
		}else {
			System.out.println("The list is empty");
			return null;
		}
	}
	
	public E delete(SLLNode<E> node) {
		if(first != null) {
			SLLNode<E> tmp = first;
			if(first == node) {
				return this.deleteFirst();
			}
			while(tmp.succ != null && tmp.succ != node)
				tmp = tmp.succ;
			if(tmp.succ == node) {
				tmp.succ = tmp.succ.succ;
				return node.element;
			}else {
				System.out.println("The element doesn't exist in the list.");
				return null;
			}
		}else {
			System.out.println("The list is empty!");
			return null;
		}
	}
	
	public SLLNode<E> getFirst(){
		return first;
	}
	
	public SLLNode<E> find(E o){
		if(first != null) {
			SLLNode<E> tmp = first;
			while(!tmp.element.equals(o) && tmp.succ != null)
				tmp = tmp.succ;
			if(tmp.element.equals(o)) {
				return tmp;
			}else {
				System.out.println("The element doesn't exist in the list");
			}
		}else {
			System.out.println("The list is empty");
		}
		return first;
	}
}

public class MysticalCardGame{
	public static void startDuel(SLL<Card> firstSorcererCards, SLL<Card> secondSorcererCards) {
		SLLNode<Card> firstSorcerer = firstSorcererCards.getFirst();
		SLLNode<Card> secondSorcerer = secondSorcererCards.getFirst();
		
		SLLNode<Card> target = null;
		int k = 0;
		
		while(secondSorcerer != null) {
			if(k == 4) {
				target = secondSorcerer;
				break;
			}
			k++;
			secondSorcerer = secondSorcerer.succ;
		}
		
		SLLNode<Card> chosenOne = firstSorcerer;
		
		
		int worth = firstSorcerer.element.significance();
		
		while(firstSorcerer != null) {
			int worthh = firstSorcerer.element.significance();
			if(worth < worthh) {
				worth = worthh;
				chosenOne = firstSorcerer;
			}
			firstSorcerer = firstSorcerer.succ;
		}
		
		secondSorcererCards.insertBefore(chosenOne.element, target);
		firstSorcererCards.delete(chosenOne);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SLL<Card> firstSorcererCards = new SLL<Card>();
		SLL<Card> secondSorcererCards = new SLL<Card>();
		
		
		for(int i=0; i < 8;i++) {
			String line = scanner.nextLine();
			String[] parts = line.split("\\s+");
			firstSorcererCards.insertLast(new Card(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
		}
		
		for(int i=0; i < 8;i++) {
			String line = scanner.nextLine();
			String[] parts = line.split("\\s+");
			secondSorcererCards.insertLast(new Card(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
		}
		
		startDuel(firstSorcererCards, secondSorcererCards);
		System.out.println(firstSorcererCards);
		System.out.println(secondSorcererCards);
	}
}



