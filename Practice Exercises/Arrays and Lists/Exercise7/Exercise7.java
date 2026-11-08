
import java.util.Scanner;

class DLLNode<E> {
    E info;
    DLLNode<E> next;
    DLLNode<E> prev;

    DLLNode(E info) {
        this.info = info;
        this.next = null;
        this.prev = null;
    }
}

class DLL<E> {
    DLLNode<E> first;
    DLLNode<E> last;

    DLL() {
        first = null;
        last = null;
    }

    void insertLast(E element) {
        DLLNode<E> node = new DLLNode<>(element);

        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
    }

    void rotateRight(int k) {
        if (first == null || first == last) {
            return;
        }

        int n = 0;
        DLLNode<E> current = first;

        while (current != null) {
            n++;
            current = current.next;
        }

        k = k % n;

        if (k == 0) {
            return;
        }

        // Find the new last node
        int steps = n - k;
        DLLNode<E> newLast = first;

        for (int i = 1; i < steps; i++) {
            newLast = newLast.next;
        }

        DLLNode<E> newFirst = newLast.next;

        // Connect the old last node with the old first node
        last.next = first;
        first.prev = last;

        // Break the list at the new last node
        newLast.next = null;
        newFirst.prev = null;

        // Update first and last
        first = newFirst;
        last = newLast;
    }

    void printList() {
        DLLNode<E> current = first;

        while (current != null) {
            System.out.print(current.info);

            if (current.next != null) {
                System.out.print("<->");
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

        DLL<Integer> list = new DLL<>();

        for (int i = 0; i < n; i++) {
            list.insertLast(input.nextInt());
        }

        int k = input.nextInt();

        list.printList();

        list.rotateRight(k);

        list.printList();

        input.close();
    }
}
