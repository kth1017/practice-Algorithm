package graph;

import java.util.Stack;

public class Prac3 {
    // DFS(스택)
    public static void main(String[] args) {
        int n = 5;
        int m = 6;
        int[][] graph = {
            {1, 0, 1, 0, 1, 0},
            {1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1}
        };

        System.out.println(dfs2(0, 0, n, m, graph));
    }


    public static int dfs2(int x, int y, int n, int m, int[][] graph) {
        Stack<Node> stack = new Stack<>();
        stack.push(new Node(x, y));

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            x = node.getX();
            y = node.getY();

            if (x <= -1 || x >= n || y <= -1 || y >= m) {
                continue;
            }

            if (graph[x][y] == 0) {
                graph[x][y] = 1;

                stack.push(new Node(x - 1, y));
                stack.push(new Node(x + 1, y));
                stack.push(new Node(x, y - 1));
                stack.push(new Node(x, y + 1));
            }
        }

        return 1;
    }

    static class Node {
        private final int x;
        private final int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }


}
