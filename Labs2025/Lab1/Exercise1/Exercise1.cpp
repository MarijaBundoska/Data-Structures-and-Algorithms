





import java.util.Scanner;




class Node{

 int data;

 Node prev;

 Node next;

 

 Node(int data){

 this.data = data;

 }

}




class MoveLastKToFront{

 static Node first = null;

 static Node last = null;

 

 

 public static void addLast(int data) {

 Node newNode = new Node(data);

 if(first == null) {

 first = last = newNode;

 }else {

 last.next = newNode;

 newNode.prev = last;

 last = newNode;

 }

 }

 

 public static void printList(Node node) {

 Node temp= node;

 while(temp!=null) {

 System.out.print(temp.data);

 if(temp.next != null) {

 System.out.print("<->");

 }

 temp = temp.next;

 }

 System.out.println();

 }

 

 public static void moveLastKToFront(int k) {

 if(first == null || k==0) {

 return ;

 }
 //broime kolku el ima 
int length =0;
Node tempLen = first;

while(tempLen!=null){
    length++;
    tempLen= tempLen.next;
}

if(k>=length){
    return;
}

 

 Node temp = last; 
//2
 //1 3 5 7 
 //5 
 //7 ni e posleden pa go cuvame vo temp
 //

 for(int i=0;i<k-1;i++) {

 temp= temp.prev; 

 }

 

 Node newHead = temp;

 Node newTail = temp.prev;

 

 if(newTail.next == null) {

 return;

 }

 newTail.next = null;

 newHead.prev = null;

 

 last.next = first;

 first.prev = last;

 

 first = newHead;

 last= newTail;

 }

}



public class Mari {

 public static void main(String [] args) {

 Scanner in = new Scanner(System.in);

 int n = in.nextInt();

 

 for(int i=0;i<n;i++) {

 MoveLastKToFront.addLast(in.nextInt());

 }

 int k = in.nextInt();

 

 MoveLastKToFront.printList(MoveLastKToFront.first);

 MoveLastKToFront.moveLastKToFront(k);

 MoveLastKToFront.printList(MoveLastKToFront.first);

 }
}
