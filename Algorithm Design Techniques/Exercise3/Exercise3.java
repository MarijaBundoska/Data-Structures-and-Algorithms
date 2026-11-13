import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Task {
    int time;
    int earnings;

    Task(int time, int earnings) {
        this.time = time;
        this.earnings = earnings;
    }

    double earningsPerHour() {
        return (double) earnings / time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        Task[] tasks = new Task[n];

        for (int i = 0; i < n; i++) {
            int time = input.nextInt();
            int earnings = input.nextInt();

            tasks[i] = new Task(time, earnings);
        }

        Arrays.sort(tasks, Comparator.comparingDouble(
                Task::earningsPerHour).reversed());

        int remainingTime = 40;
        int maxEarnings = 0;

        for (int i = 0; i < n && remainingTime > 0; i++) {
            if (tasks[i].time <= remainingTime) {
                maxEarnings += tasks[i].earnings;
                remainingTime -= tasks[i].time;
            } else {
                maxEarnings += tasks[i].earnings * remainingTime
                        / tasks[i].time;
                remainingTime = 0;
            }
        }

        System.out.println(maxEarnings);

        input.close();
    }
}
