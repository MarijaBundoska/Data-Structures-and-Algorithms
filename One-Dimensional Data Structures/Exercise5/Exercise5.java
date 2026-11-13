import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Student {
    String name;
    int index;
    int highSchool;

    Student(String name, int index, int highSchool) {
        this.name = name;
        this.index = index;
        this.highSchool = highSchool;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        Queue<Student> documents = new LinkedList<>();
        Queue<Student> index = new LinkedList<>();
        Queue<Student> highSchool = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String name = input.nextLine();

            int d = Integer.parseInt(input.nextLine());
            int ind = Integer.parseInt(input.nextLine());
            int h = Integer.parseInt(input.nextLine());

            Student student = new Student(name, ind, h);

            if (d == 1) {
                documents.add(student);
            } else if (ind == 1) {
                index.add(student);
            } else if (h == 1) {
                highSchool.add(student);
            }
        }

        while (!documents.isEmpty() || !index.isEmpty() || !highSchool.isEmpty()) {

            for (int i = 0; i < 2 && !documents.isEmpty(); i++) {
                Student current = documents.poll();

                if (current.index == 1) {
                    index.add(current);
                } else if (current.highSchool == 1) {
                    highSchool.add(current);
                } else {
                    System.out.println(current.name);
                }
            }

            for (int i = 0; i < 3 && !index.isEmpty(); i++) {
                Student current = index.poll();

                if (current.highSchool == 1) {
                    highSchool.add(current);
                } else {
                    System.out.println(current.name);
                }
            }
          
            for (int i = 0; i < 1 && !highSchool.isEmpty(); i++) {
                Student current = highSchool.poll();
                System.out.println(current.name);
            }
        }

        input.close();
    }
}
