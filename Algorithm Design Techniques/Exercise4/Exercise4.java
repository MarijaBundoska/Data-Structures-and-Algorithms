import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = input.nextInt();
            end[i] = input.nextInt();
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0;
        int j = 0;

        int rooms = 0;
        int maxRooms = 0;

        while (i < n) {
            if (start[i] <= end[j]) {
                rooms++;
                i++;
            } else {
                rooms--;
                j++;
            }

            maxRooms = Math.max(maxRooms, rooms);
        }

        System.out.println(maxRooms);

        input.close();
    }
}
