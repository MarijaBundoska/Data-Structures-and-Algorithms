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

        int N = input.nextInt();
        input.nextLine();

        SLL<String> list = new SLL<>();

        for (int i = 0; i < N; i++) {
            String word = input.nextLine();
            list.insertLast(word);
        }

        int L = input.nextInt();
        
        
        list.printList();

        SLLNode<String> current = list.head;
        SLLNode<String> prev = null;

        while (current != null) {
            if (current.info.length() > L) {
                SLLNode<String> node = new SLLNode<>("Outlier");

                node.next = current;

                if (prev == null) {
                    list.head = node;
                } else {
                    prev.next = node;
                }
            }

            prev = current;
            current = current.next;
        }
        
        list.printList();

        input.close();
    }
}
