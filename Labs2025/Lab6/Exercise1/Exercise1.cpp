import java.util.*;

public class Main {

    static Map<String, List<String>> tree = new HashMap<>();

    static int countLeaves(String node) {
        List<String> children = tree.get(node);
        if (children == null || children.isEmpty()) return 1;
        int sum = 0;
        for (String c : children) sum += countLeaves(c);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine().trim());
        String root = sc.nextLine().trim();
        tree.putIfAbsent(root, new ArrayList<>());

        for (int i = 0; i < N - 1; i++) {
            String parent = sc.next();
            String child = sc.next();
            sc.nextLine();
            tree.putIfAbsent(parent, new ArrayList<>());
            tree.putIfAbsent(child, new ArrayList<>());
            tree.get(parent).add(child);
        }

        int M = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < M; i++) {
            String q = sc.nextLine().trim();
            System.out.println(countLeaves(q));
        }
    }
}
