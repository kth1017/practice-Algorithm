public class Prac1 {
    public static void main(String[] args) {
        int n = 5;
        int m = 6;
        int[][] graph = {
            {INF, 0, 1, INF, 1, INF},
            {0, INF, 1, 1, 1, 1},
            {1, 1, INF, 0, 0, 1},
            {INF, 1, 0, INF, 1, 1},
            {1, 1, 0, 1, INF, 1}
        };

        System.out.println(prim(0, n, m, graph));
    }

    public static final int INF = (int) 1e9;

    public static int prim(int start, int n, int m, int[][] graph) {
        int[] distance = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            distance[i] = INF;
        }

        distance[start] = 0;
        visited[start] = true;

        for (int i = 0; i < n - 1; i++) {
            int now = getSmallestNode(n, distance, visited);
            visited[now] = true;

            for (int j = 0; j < n; j++) {
                if (!visited[j] && graph[now][j] != INF) {
                    distance[j] = Math.min(distance[j], graph[now][j]);
                }
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            if (distance[i] != INF) {
                result += distance[i];
            }
        }

        return result;
    }

    public static int getSmallestNode(int n, int[] distance, boolean[] visited) {
        int min = INF;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (distance[i] < min && !visited[i]) {
                min = distance[i];
                index = i;
            }
        }

        return index;
    }
}
