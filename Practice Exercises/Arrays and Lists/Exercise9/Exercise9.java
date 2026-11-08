
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

    boolean moveFirstOccurrence(E M, int k) {
        DLLNode<E> current = first;
        int index = 0;
        int n = 0;

        // Find the first occurrence of M
        while (current != null && !current.info.equals(M)) {
            current = current.next;
            index++;
        }

        // Count the number of nodes
        DLLNode<E> temp = first;

        while (temp != null) {
            n++;
            temp = temp.next;
        }

        // If M does not exist
        if (current == null) {
            return false;
        }

        // Calculate the new position (circular movement to the left)
        int newIndex = (index - (k % n) + n) % n;

        // If the position does not change
        if (newIndex == index) {
            return true;
        }

        // Remove current from its original position
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            first = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            last = current.prev;
        }

        // Insert current at the new position
        if (newIndex == 0) {
            current.prev = null;
            current.next = first;

            if (first != null) {
                first.prev = current;
            }

            first = current;

            if (last == null) {
                last = current;
            }
        } else {
            DLLNode<E> target = first;

            for (int i = 0; i < newIndex - 1; i++) {
                target = target.next;
            }

            current.next = target.next;
            current.prev = target;

            if (target.next != null) {
                target.next.prev = current;
            } else {
                last = current;
            }

            target.next = current;
        }

        return true;
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

        int M = input.nextInt();
        int k = input.nextInt();

        list.printList();

        boolean exists = list.moveFirstOccurrence(M, k);

        if (exists) {
            list.printList();
        } else {
            System.out.println("Elementot ne postoi vo listata");
            list.printList();
        }

        input.close();
    }
}
