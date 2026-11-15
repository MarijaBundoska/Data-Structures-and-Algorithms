import java.util.Scanner;

public class Main {

    static int binarySearch(int[] array, int left, int right, int target) {

        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid;
        }

        if (target < array[mid]) {
            return binarySearch(array, left, mid - 1, target);
        }

        return binarySearch(array, mid + 1, right, target);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        int position = binarySearch(array, 0, n - 1, m);

        if (position == -1) {
            System.out.println("Ne postoi");
        } else {
            System.out.println(position);
        }

        input.close();
    }
}
