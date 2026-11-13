import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Student {
    String name;
    int fiction;
    int history;

    Student(String name, int fiction, int history) {
        this.name = name;
        this.fiction = fiction;
        this.history = history;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        Queue<Student> science = new LinkedList<>();
        Queue<Student> fiction = new LinkedList<>();
        Queue<Student> history = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String name = input.nextLine();

            int s = Integer.parseInt(input.nextLine());
            int f = Integer.parseInt(input.nextLine());
            int h = Integer.parseInt(input.nextLine());

            Student student = new Student(name, f, h);

            if (s == 1) {
                science.add(student);
            } else if (f == 1) {
                fiction.add(student);
            } else {
                history.add(student);
            }
        }

        while (!science.isEmpty()) {
            Student current = science.poll();

            if (current.fiction == 1) {
                fiction.add(current);
            } else if (current.history == 1) {
                history.add(current);
            } else {
                System.out.println(current.name);
            }
        }

        while (!fiction.isEmpty()) {
            Student current = fiction.poll();

            if (current.history == 1) {
                history.add(current);
            } else {
                System.out.println(current.name);
            }
        }

        while (!history.isEmpty()) {
            Student current = history.poll();
            System.out.println(current.name);
        }

        input.close();
    }
}
