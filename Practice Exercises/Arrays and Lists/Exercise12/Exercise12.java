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

    void moveFirstKToEnd(int k) {
        if (first == null || k == 0) {
            return;
        }

        int n = 0;
        DLLNode<E> current = first;

        while (current != null) {
            n++;
            current = current.next;
        }

        if (k == n) {
            return;
        }

        DLLNode<E> newFirst = first;

        for (int i = 0; i < k; i++) {
            newFirst = newFirst.next;
        }

        DLLNode<E> newLast = newFirst.prev;

        last.next = first;
        first.prev = last;

        newLast.next = null;
        newFirst.prev = null;

        first = newFirst;
        last = newLast;
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

        list.moveFirstKToEnd(k);

        list.printList();

        input.close();
    }
}
