package graph;

public class Prac5 {
    public static final int INF = (int) 1e9;
    public static final int[] dx = {-1, 1, 0, 0};
    public static final int[] dy = {0, 0, -1, 1};

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

        System.out.println(bellmanFord(0, 0, n, m, graph));
    }

    public static int bellmanFord(int x, int y, int n, int m, int[][] graph) {
        int[][] distance = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                distance[i][j] = INF;
            }
        }

        distance[x][y] = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (distance[j][k] == INF) {
                        continue;
                    }

                    for (int l = 0; l < 4; l++) {
                        int nx = j + dx[l];
                        int ny = k + dy[l];

                        if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                            continue;
                        }

                        if (distance[nx][ny] > distance[j][k] + graph[nx][ny]) {
                            distance[nx][ny] = distance[j][k] + graph[nx][ny];
                        }
                    }
                }
            }
        }

        return distance[n - 1][m - 1];
    }

    static class Node {
        private final int x;
        private final int y;
        private final int distance;

        public Node(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getDistance() {
            return distance;
        }
    }



}
