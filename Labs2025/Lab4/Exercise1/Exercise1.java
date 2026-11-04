import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        while (true) {
            String line = scan.nextLine().trim();

            if (line.equals("x")) {
                break;
            }

            if (line.startsWith("end")) {
                String funcName = line.substring(3);

                if (stack.isEmpty()) {
                    System.out.println("Invalid");
                    return;
                }

                String lastOpened = stack.pop();

                if (!lastOpened.equals(funcName)) {
                    System.out.println("Invalid");
                    return;
                }

            } else {
                stack.push(line);
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
