
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

    int countElementsWithGreaterLeftAverage() {
        if (first == null || first == last) {
            return 0;
        }

        long totalSum = 0;
        int n = 0;

        DLLNode<E> current = first;

        while (current != null) {
            totalSum += (Integer) current.info;
            n++;
            current = current.next;
        }

        if (n < 3) {
            return 0;
        }

        long leftSum = (Integer) first.info;
        int leftCount = 1;
        int count = 0;

        current = first.next;

        while (current.next != null) {
            long rightSum = totalSum - leftSum - (Integer) current.info;

            int rightCount = n - leftCount - 1;

            double leftAverage = (double) leftSum / leftCount;
            double rightAverage = (double) rightSum / rightCount;

            if (leftAverage > rightAverage) {
                count++;
            }

            leftSum += (Integer) current.info;
            leftCount++;

            current = current.next;
        }

        return count;
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

        System.out.println(list.countElementsWithGreaterLeftAverage());

        input.close();
    }
}
