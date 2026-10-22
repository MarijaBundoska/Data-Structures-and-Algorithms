import java.util.Scanner;

class Node {
    int data;
    Node prev, next;
    Node(int data) { this.data = data; }
}

class DoublyLinkedList {
    Node head, tail;
    int size = 0;

    void addLast(int data) {
        Node n = new Node(data);
        if (head == null) head = tail = n;
        else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
        size++;
    }

    void printList() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data);
            if (cur.next != null) System.out.print("<->");
            cur = cur.next;
        }
        System.out.println();
    }

    boolean moveLeftCircular(int M, int k) {
        if (head == null) return false;

       
        Node cur = head;
        int pos = 0;
        while (cur != null && cur.data != M) {
            cur = cur.next;
            pos++;
        }
        if (cur == null) {
            return false;
        }

       
        if (size == 1 || k % size == 0) return true;

        int shift = k % size;
        int target = (pos - shift + size) % size; 

       
        if (target == pos) return true;

       
        if (cur.prev != null) cur.prev.next = cur.next;
        else head = cur.next;

        if (cur.next != null) cur.next.prev = cur.prev;
        else tail = cur.prev;

      
        if (target == 0) {
            cur.prev = null;
            cur.next = head;
            if (head != null) head.prev = cur;
            head = cur;
            if (tail == null) tail = cur;
        } else {
            Node ptr = head;
            for (int i = 0; i < target - 1; i++) ptr = ptr.next;
            cur.next = ptr.next;
            cur.prev = ptr;
            ptr.next = cur;
            if (cur.next != null) cur.next.prev = cur;
            else tail = cur;
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) list.addLast(sc.nextInt());

        int M = sc.nextInt();
        int k = sc.nextInt();

        list.printList();

        boolean found = list.moveLeftCircular(M, k);
        if (!found) {
            System.out.println("Elementot ne postoi vo listata");
        }
        list.printList();
    }
}
