package graph;

import java.util.PriorityQueue;

public class Prac4 {
    // Shortest Path Algorithm(dijkstra)
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

        System.out.println(dijkstra(0, 0, n, m, graph));
    }

    public static final int INF = (int) 1e9;

    public static int dijkstra(int x, int y, int n, int m, int[][] graph) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int[][] distance = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                distance[i][j] = INF;
            }
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(x, y, 0));
        distance[x][y] = 0;

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            x = node.getX();
            y = node.getY();
            int dist = node.getDistance();

            if (distance[x][y] < dist) {
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }

                int cost = dist + graph[nx][ny];

                if (cost < distance[nx][ny]) {
                    distance[nx][ny] = cost;
                    pq.offer(new Node(nx, ny, cost));
                }
            }
        }

        return distance[n - 1][m - 1];
    }

    static class Node implements Comparable<Node> {
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

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }
}
