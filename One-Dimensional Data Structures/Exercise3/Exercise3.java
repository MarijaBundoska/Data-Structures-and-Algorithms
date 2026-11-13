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
            } else if (h == 1) {
                history.add(student);
            }
        }

        while (!science.isEmpty() || !fiction.isEmpty() || !history.isEmpty()) {

        
            for (int i = 0; i < 2 && !science.isEmpty(); i++) {
                Student current = science.poll();

                if (current.fiction == 1) {
                    fiction.add(current);
                } else if (current.history == 1) {
                    history.add(current);
                } else {
                    System.out.println(current.name);
                }
            }

            for (int i = 0; i < 1 && !fiction.isEmpty(); i++) {
                Student current = fiction.poll();

                if (current.history == 1) {
                    history.add(current);
                } else {
                    System.out.println(current.name);
                }
            }
          
            for (int i = 0; i < 2 && !history.isEmpty(); i++) {
                Student current = history.poll();
                System.out.println(current.name);
            }
        }

        input.close();
    }
}
