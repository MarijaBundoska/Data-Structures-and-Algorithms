import java.util.*;

class BNode {
    int info;
    BNode left, right;

    BNode(int info) {
        this.info = info;
    }
}

class BSTree {
    BNode root;
    int sum = 0;

    void insert(int x) {
        root = insertRec(root, x);
    }

    BNode insertRec(BNode node, int x) {
        if (node == null) return new BNode(x);
        if (x < node.info)
            node.left = insertRec(node.left, x);
        else
            node.right = insertRec(node.right, x);
        return node;
    }
    void transform() {
        inorder(root);
    }

    void inorder(BNode node) {
        if (node == null) return;
        inorder(node.left);
        node.info += sum;
        sum = node.info;
        inorder(node.right);
    }

    void printTreeWithIndent() {
        printRec(root, 0);
    }

    void printRec(BNode node, int level) {
        if (node == null) return;

        printRec(node.left, level + 1);

        for (int i = 0; i < level; i++)
            System.out.print("   ");
        System.out.println(node.info);

        printRec(node.right, level + 1);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BSTree tree = new BSTree();
        for (int i = 0; i < n; i++) {
            tree.insert(sc.nextInt());
        }

        tree.transform();
        tree.printTreeWithIndent();
    }
}
