import java.util.Scanner;

class SLLNode<E> {
    E info;
    SLLNode<E> next;

    SLLNode(E info) {
        this.info = info;
        this.next = null;
    }
}

class SLL<E> {
    SLLNode<E> head;
    SLLNode<E> tail;

    SLL() {
        head = null;
        tail = null;
    }

    void insertLast(E info) {
        SLLNode<E> node = new SLLNode<>(info);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    void deleteShortStrings(int L) {
        while (head != null && head.info.toString().length() < L) {
            head = head.next;
        }

        
        SLLNode<E> current = head;

        while (current != null && current.next != null) {
            if (current.next.info.toString().length() < L) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

      
        tail = head;

        if (tail != null) {
            while (tail.next != null) {
                tail = tail.next;
            }
        }
    }

    void printList() {
        SLLNode<E> current = head;

        while (current != null) {
            System.out.print(current.info);

            if (current.next != null) {
                System.out.print("->");
            }

            current = current.next;
        }

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        SLL<String> list = new SLL<>();

        for (int i = 0; i < n; i++) {
            String word = input.next();
            list.insertLast(word);
        }

        int L = input.nextInt();

        // Printing the list before transformation
        list.printList();

        // Removing strings shorter than L
        list.deleteShortStrings(L);

        // Printing the list after transformation
        list.printList();

        input.close();
    }
}
