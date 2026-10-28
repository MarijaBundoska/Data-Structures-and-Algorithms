
import java.util.Scanner;

class Node {
    String value;
    Node next;

    Node(String value) {
        this.value = value;
        this.next = null;
    }
}

public class Main {

    static Node createList(String[] values) {
        Node head = null;
        Node tail = null;

        for (String value : values) {
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    static void printList(Node head) {
        if (head == null) {
            System.out.println("Prazna lista!!!");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.print(current.value);

            if (current.next != null) {
                System.out.print("->");
            }

            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] firstValues = new int[n];
        String[] firstStrings = new String[n];

        for (int i = 0; i < n; i++) {
            firstValues[i] = scanner.nextInt();
            firstStrings[i] = String.valueOf(firstValues[i]);
        }

        int m = scanner.nextInt();
        int[] secondValues = new int[m];
        String[] secondStrings = new String[m];

        for (int i = 0; i < m; i++) {
            secondValues[i] = scanner.nextInt();
            secondStrings[i] = String.valueOf(secondValues[i]);
        }

        double x = scanner.nextDouble();

        Node firstHead = createList(firstStrings);
        Node secondHead = createList(secondStrings);

        Node[] firstNodes = new Node[n];
        Node[] secondNodes = new Node[m];

        Node current = firstHead;
        for (int i = 0; i < n; i++) {
            firstNodes[i] = current;
            current = current.next;
        }

        current = secondHead;
        for (int i = 0; i < m; i++) {
            secondNodes[i] = current;
            current = current.next;
        }

        boolean[] removeSecond = new boolean[m];

        int paired = Math.min(n, m);

        for (int i = 0; i < paired; i++) {
            int a = firstValues[i];
            int b = secondValues[i];

            if (Math.abs((double) a - b) > x) {
                firstNodes[i].value = "Outlier " + a;
                removeSecond[i] = true;
            }
        }

        for (int i = m; i < n; i++) {
            firstNodes[i].value = "Unchecked " + firstValues[i];
        }

        Node newSecondHead = null;
        Node secondTail = null;

        for (int i = 0; i < m; i++) {
            if (!removeSecond[i]) {
                secondNodes[i].next = null;

                if (newSecondHead == null) {
                    newSecondHead = secondNodes[i];
                    secondTail = secondNodes[i];
                } else {
                    secondTail.next = secondNodes[i];
                    secondTail = secondNodes[i];
                }
            }
        }

        printList(firstHead);
        printList(newSecondHead);

        scanner.close();
    }
}
