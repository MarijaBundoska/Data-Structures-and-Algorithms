import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Process {
    String name;
    int time;

    Process(String name, int time) {
        this.name = name;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int T = input.nextInt();

        Queue<Process> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String name = input.next();
            int time = input.nextInt();

            queue.add(new Process(name, time));
        }

        int order = 1;

        while (!queue.isEmpty()) {
            Process current = queue.poll();

            if (current.time > T) {
                current.time -= T;
                queue.add(current);
            } else {
                System.out.println(order + ". " + current.name);
                order++;
            }
        }

        input.close();
    }
}
