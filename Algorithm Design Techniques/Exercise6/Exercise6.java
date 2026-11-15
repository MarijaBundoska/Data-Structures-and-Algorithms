import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static void update(int[] tree, int index, int n) {
        while (index <= n) {
            tree[index]++;
            index += index & -index;
        }
    }

    static int query(int[] tree, int index) {
        int sum = 0;

        while (index > 0) {
            sum += tree[index];
            index -= index & -index;
        }

        return sum;
    }

    static int lowerBound(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        int[] sorted = numbers.clone();
        Arrays.sort(sorted);

        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0 || sorted[i] != sorted[i - 1]) {
                sorted[uniqueCount] = sorted[i];
                uniqueCount++;
            }
        }

        int[] unique = Arrays.copyOf(sorted, uniqueCount);
        int[] tree = new int[uniqueCount + 1];

        StringBuilder result = new StringBuilder();
        int misplacedCount = 0;
        int seen = 0;

        for (int i = 0; i < n; i++) {
            int number = numbers[i];

            int rank = lowerBound(unique, number) + 1;

            int smallerOrEqual = query(tree, rank);
            int greaterBefore = seen - smallerOrEqual;

            if (greaterBefore > 0) {
                misplacedCount++;
                result.append(number)
                      .append(" ")
                      .append(greaterBefore)
                      .append("\n");
            }

            update(tree, rank, uniqueCount);
            seen++;
        }

        System.out.println(misplacedCount);
        System.out.print(result);

        input.close();
    }
}
