import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] digits = new int[n];

        for (int i = 0; i < n; i++) {
            digits[i] = input.nextInt();
        }

        Arrays.sort(digits);

        StringBuilder result = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {
            result.append(digits[i]);
        }

        System.out.println(result);

        input.close();
    }
}
