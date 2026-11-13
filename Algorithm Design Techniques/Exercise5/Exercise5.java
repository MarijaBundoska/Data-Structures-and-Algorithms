import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int[] positions = new int[n];

        for (int i = 0; i < n; i++) {
            positions[i] = input.nextInt();
        }

        Arrays.sort(positions);

        int current = 1;
        int i = 0;
        int lights = 0;

        while (current <= m) {

            while (i < n && positions[i] < current - 2) {
                i++;
            }

            int j = i;

            while (j < n && positions[j] <= current + 2) {
                j++;
            }

            if (j == i) {
                System.out.println(-1);
                input.close();
                return;
            }

            int chosenPosition = positions[j - 1];

            lights++;
            current = chosenPosition + 3;
            i = j;
        }

        System.out.println(lights);

        input.close();
    }
}
