
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

        SLLNode<String> lastMatch = null;
        SLLNode<String> prevLastMatch = null;

        while (current != null) {

            if (current.info.length() == L) {
                lastMatch = current;
                prevLastMatch = prev;
            }

            prev = current;
            current = current.next;
        }

        if (lastMatch != null && lastMatch != list.head) {

            prevLastMatch.next = lastMatch.next;

            if (lastMatch == list.tail) {
                list.tail = prevLastMatch;
            }

            lastMatch.next = list.head;
            list.head = lastMatch;
        }

        list.printList();

        input.close();
    }
}
