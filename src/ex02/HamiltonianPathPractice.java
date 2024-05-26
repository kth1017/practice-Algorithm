package ex02;

public class HamiltonianPathPractice {
    public static void main(String[] args) {
        int n = 5;
        int[][] graph = {
            {0, 1, 0, 1, 0},
            {1, 0, 1, 1, 1},
            {0, 1, 0, 0, 1},
            {1, 1, 0, 0, 1},
            {0, 1, 1, 1, 0}
        };

        int[] path = new int[n];
        boolean[] visited = new boolean[n];
        boolean result = false;

        for (int i = 0; i < n; i++) {
            path[0] = i;
            visited[i] = true;
            result = dfs(graph, path, visited, 1);
            visited[i] = false;

            if (result) {
                break;
            }
        }

        System.out.println(result);
    }

    public static boolean dfs(int[][] graph, int[] path, boolean[] visited, int idx) {
        if (idx == path.length) {
            return true;
        }

        for (int i = 0; i < graph.length; i++) {
            if (graph[path[idx - 1]][i] == 1 && !visited[i]) {
                path[idx] = i;
                visited[i] = true;
                if (dfs(graph, path, visited, idx + 1)) {
                    return true;
                }
                visited[i] = false;
            }
        }

        return false;
    }
}
