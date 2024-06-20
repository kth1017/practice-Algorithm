package graph;

public class Prac1 {
    // DFS(재귀)
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

        System.out.println(dfs1(0, 0, n, m, graph));
    }

    public static int dfs1(int x, int y, int n, int m, int[][] graph) {
        if (x <= -1 || x >= n || y <= -1 || y >= m) {
            return 0;
        }

        if (graph[x][y] == 0) {
            graph[x][y] = 1;

            dfs1(x - 1, y, n, m, graph);
            dfs1(x + 1, y, n, m, graph);
            dfs1(x, y - 1, n, m, graph);
            dfs1(x, y + 1, n, m, graph);

            return 1;
        }

        return 0;
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
    }


}
