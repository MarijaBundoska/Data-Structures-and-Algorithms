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

        SLLNode<String> keepHead = null;
        SLLNode<String> keepTail = null;

        SLLNode<String> moveHead = null;
        SLLNode<String> moveTail = null;

        SLLNode<String> current = list.head;

        while (current != null) {

            SLLNode<String> next = current.next;
            current.next = null;

            if (current.info.length() == L) {

                if (moveHead == null) {
                    moveHead = current;
                    moveTail = current;
                } else {
                    moveTail.next = current;
                    moveTail = current;
                }

            } else {

                if (keepHead == null) {
                    keepHead = current;
                    keepTail = current;
                } else {
                    keepTail.next = current;
                    keepTail = current;
                }
            }

            current = next;
        }

        if (keepHead == null) {
            list.head = moveHead;
            list.tail = moveTail;
        } else {
            list.head = keepHead;

            if (moveHead != null) {
                keepTail.next = moveHead;
                list.tail = moveTail;
            } else {
                list.tail = keepTail;
            }
        }

        list.printList();

        input.close();
    }
}
