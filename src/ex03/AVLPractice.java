package ex03;

public class AVLPractice {
    static class Node {
        int key, height;
        Node left, right;

        Node(int key) {
            this.key = key;
            this.height = 1;
        }
    }

    public static int height(Node node) {
        return node == null ? 0 : node.height;
    }

    public static void updateHeight(Node node) {
        node.height = Math.max(height(node.left), height(node.right)) + 1;
    }

    public static int balanceFactor(Node node) {
        return height(node.left) - height(node.right);
    }

    // javax AVL 라이브러리 사용


}
