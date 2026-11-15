import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static int[] tasks;
    static int n;

    static boolean canPack(int index, int[] remaining, int bins) {

        if (index == n) {
            return true;
        }

        int previousRemaining = -1;

        for (int i = 0; i < bins; i++) {

            if (remaining[i] >= tasks[index]
                    && remaining[i] != previousRemaining) {

                previousRemaining = remaining[i];

                remaining[i] -= tasks[index];

                if (canPack(index + 1, remaining, bins)) {
                    return true;
                }

                remaining[i] += tasks[index];
            }
        }

        return false;
    }

    static int minimumBins() {

        int total = 0;

        for (int task : tasks) {
            total += task;
        }

        int lowerBound = (total + 7) / 8;

        for (int bins = lowerBound; bins <= n; bins++) {

            int[] remaining = new int[bins];
            Arrays.fill(remaining, 8);

            if (canPack(0, remaining, bins)) {
                return bins;
            }
        }

        return n;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        int m = input.nextInt();

        tasks = new int[n];

        int totalHours = 0;

        for (int i = 0; i < n; i++) {
            tasks[i] = input.nextInt();
            totalHours += tasks[i];
        }

        Arrays.sort(tasks);

        for (int i = 0; i < n / 2; i++) {
            int temp = tasks[i];
            tasks[i] = tasks[n - 1 - i];
            tasks[n - 1 - i] = temp;
        }

        int bins = minimumBins();

        int days = (bins + m - 1) / m;

        int freeHours = days * m * 8 - totalHours;

        System.out.println(days + " " + freeHours);

        input.close();
    }
}
