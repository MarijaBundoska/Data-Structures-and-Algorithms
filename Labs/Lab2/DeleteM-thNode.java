## Problem Statement
//You are given a single linked list with integer nodes. 
//Additionally, you are given one more integer M (M>1). 
//You need to delete every M-th element from the list.

// Дадена е еднострано поврзана листа со јазли од цели броеви. 
// Дополнително, даден е цел број M (M > 1).
// Потребно е да се избрише секој M-ти елемент од листата.



### Solution - Version 1: Naive Approach using `list.delete()`

In the first approach, the existing `delete(node)` method from the `SLL` class was used inside a loop. 

While this solution is logically correct and yields the required result, it is inefficient. The `delete(node)` method searches for the predecessor 
node starting from the head (`first`) every time it is called, giving it a time complexity of $O(N)$. Calling it inside a `while` loop that iterates
  through the list results in an overall time complexity of O(N^2).


import java.util.Scanner;

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
	
	public void deleteList() {
		first = null;
	}
	
	public int size() {
		int listSize = 0;
		SLLNode<E> tmp = first;
		while(tmp != null) {
			listSize++;
			tmp = tmp.succ;
		}
		return listSize;
	}
	
	@Override
	public String toString() {
		String ret = new String();
		if(first != null) {
			SLLNode<E> tmp = first;
			ret += tmp;
			while(tmp.succ != null) {
				tmp = tmp.succ;
				ret += " " + tmp;
			}
		}else
			ret = "Empty list!";
		return ret;
	}
	
	public void insertFirst(E o) {
		SLLNode<E> ins = new SLLNode<E>(o, null);
		ins.succ = first;
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
				return ;
			}
			while(tmp.succ != before && tmp.succ != null)
				tmp = tmp.succ;
			if(tmp.succ == before) {
				tmp.succ = new SLLNode<E>(o, before);
			}else {
				System.out.println("The element doesn't exist in the list!");
			}
		}else {
			System.out.println("The list is empty!");
		}
	}
	
	public void insertLast(E o) {
		if(first != null) {
			SLLNode<E> tmp = first;
			while(tmp.succ != null)
				tmp = tmp.succ;
			tmp.succ = new SLLNode<E>(o, null);
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
			System.out.println("The list is empty!");
			return null;
		}
	}
	
	public E delete(SLLNode<E> node) {
		if(first != null) {
			SLLNode<E> tmp = first;
			if(first == node) {
				return this.deleteFirst();
			}
			while(tmp.succ != node && tmp.succ != null)
				tmp = tmp.succ;
			if(tmp.succ == node) {
				tmp.succ = tmp.succ.succ;
				return node.element;
			}else {
				System.out.println("The element doesn't exist in the list!");
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
			if(tmp.element.equals(o)){
				return tmp;
			}else {
				System.out.println("The element doesn't exist in the list!");
			}
		}else {
			System.out.println("The list is empty!");
		}
		return null;
	}
	
	public void merge(SLL<E> in) {
		if(first != null) {
			SLLNode<E> tmp = first;
			while(tmp.succ != null)
				tmp = tmp.succ;
			tmp.succ = in.getFirst();
		}else {
			first = in.getFirst();
		}
	}
	
	public void mirror() {
		if(first != null) {
			SLLNode<E> tmp = first;
			SLLNode<E> newsucc = null;
			SLLNode<E> next;
			
			while(tmp != null) {
				next = tmp.succ;
				tmp.succ = newsucc;
				newsucc = tmp;
				tmp = next;
			}
			first = newsucc;
		}
	}
}

public class SpecialSLLDelete<E>{
	public void specialDelete(SLL<E> list, int m) {
		if(list.getFirst() == null || m <= 0 ) {
			return;
		}
		
		SLLNode<E> element = list.getFirst();
		int c = 1;
		
		
		while(element != null) {
			SLLNode<E> nextNode = element.succ;
			
			if(c == m) {
				list.delete(element);
				c = 0;
			}
			c++;
			element = nextNode;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		SLL<Integer> list = new SLL<>();
		for(int i=0; i < n; i++) {
			list.insertLast(input.nextInt());
		}
		
		int m = input.nextInt();
		
		SpecialSLLDelete<Integer> tmp = new SpecialSLLDelete<>();
		
		tmp.specialDelete(list, m);
		
		System.out.println(list);
	}
}


### Solution - Version 2: Optimized Approach (O(N) Time Complexity)

To achieve maximum efficiency and solve the problem in a single pass, the second version introduces a
helper reference `prev` to track the previous node during traversal. 

When the condition for deletion is met (c == m), the references are updated directly in O(1) time (`prev.succ = curr.succ`),
eliminating the need to search the list from the beginning. This reduces the total time complexity to O(N).
                                                                                                        
                


import java.util.Scanner;

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
	
	public void deleteList() {
		first = null;
	}
	
	public int size() {
		int listSize = 0;
		SLLNode<E> tmp = first;
		while(tmp != null) {
			listSize++;
			tmp = tmp.succ;
		}
		return listSize;
	}
	
	@Override
	public String toString() {
		String ret = new String();
		if(first != null) {
			SLLNode<E> tmp = first;
			ret += tmp;
			while(tmp.succ != null) {
				tmp = tmp.succ;
				ret += " " + tmp;
			}
		}else
			ret = "Empty list!";
		return ret;
	}
	
	public void insertFirst(E o) {
		SLLNode<E> ins = new SLLNode<E>(o, null);
		ins.succ = first;
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
				return ;
			}
			while(tmp.succ != before && tmp.succ != null)
				tmp = tmp.succ;
			if(tmp.succ == before) {
				tmp.succ = new SLLNode<E>(o, before);
			}else {
				System.out.println("The element doesn't exist in the list!");
			}
		}else {
			System.out.println("The list is empty!");
		}
	}
	
	public void insertLast(E o) {
		if(first != null) {
			SLLNode<E> tmp = first;
			while(tmp.succ != null)
				tmp = tmp.succ;
			tmp.succ = new SLLNode<E>(o, null);
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
			System.out.println("The list is empty!");
			return null;
		}
	}
	
	public E delete(SLLNode<E> node) {
		if(first != null) {
			SLLNode<E> tmp = first;
			if(first == node) {
				return this.deleteFirst();
			}
			while(tmp.succ != node && tmp.succ != null)
				tmp = tmp.succ;
			if(tmp.succ == node) {
				tmp.succ = tmp.succ.succ;
				return node.element;
			}else {
				System.out.println("The element doesn't exist in the list!");
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
			if(tmp.element.equals(o)){
				return tmp;
			}else {
				System.out.println("The element doesn't exist in the list!");
			}
		}else {
			System.out.println("The list is empty!");
		}
		return null;
	}
	
	public void merge(SLL<E> in) {
		if(first != null) {
			SLLNode<E> tmp = first;
			while(tmp.succ != null)
				tmp = tmp.succ;
			tmp.succ = in.getFirst();
		}else {
			first = in.getFirst();
		}
	}
	
	public void mirror() {
		if(first != null) {
			SLLNode<E> tmp = first;
			SLLNode<E> newsucc = null;
			SLLNode<E> next;
			
			while(tmp != null) {
				next = tmp.succ;
				tmp.succ = newsucc;
				newsucc = tmp;
				tmp = next;
			}
			first = newsucc;
		}
	}
}

public class SpecialSLLDelete<E>{
	public void specialDelete(SLL<E> list, int m) {
		if(list.getFirst() == null || m <= 0 ) {
			return;
		}
		
		SLLNode<E> curr = list.getFirst();
		SLLNode<E> prev = null;
		int c = 1;
		
		while(curr != null) {
			if(c == m) {
				if(prev == null) {
					list.deleteFirst();
				}else {
					prev.succ = curr.succ;
				}
				c = 0;
			} else {
				prev = curr;
			}
			c++;
			curr = curr.succ;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		SLL<Integer> list = new SLL<>();
		for(int i=0; i < n; i++) {
			list.insertLast(input.nextInt());
		}
		
		int m = input.nextInt();
		
		SpecialSLLDelete<Integer> tmp = new SpecialSLLDelete<>();
		
		tmp.specialDelete(list, m);
		
		System.out.println(list);
	}
}







                                                                                        
                                                                                                          
                                                                                                          
                                                                                                          




  
  
