import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        if (m < 1 || m > 9 * n) {
            System.out.println("Ne postoi");
            input.close();
            return;
        }

        int[] digits = new int[n];

        for (int i = 0; i < n; i++) {
            digits[i] = 0;
        }

        digits[0] = 1;
        m--;

        for (int i = n - 1; i >= 0 && m > 0; i--) {
            int add = Math.min(9 - digits[i], m);

            digits[i] += add;
            m -= add;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(digits[i]);
        }

        System.out.println();
        input.close();
    }
}
