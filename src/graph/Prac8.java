package graph;

public class Prac8 {
    // Topological Sorting practice
    public static void main(String[] args) {
        int n = 7;
        int[][] graph = {
            {0, 1},
            {0, 2},
            {1, 3},
            {1, 4},
            {2, 5},
            {3, 6},
            {4, 6},
            {5, 6}
        };

        topologicalSort(n, graph);
    }

    public static void topologicalSort(int n, int[][] graph) {
        int[] indegree = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < graph.length; j++) {
                if (graph[j][1] == i) {
                    indegree[i]++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int x = getZeroIndegree(n, indegree);
            indegree[x] = -1;
            System.out.print(x + " ");
            for (int j = 0; j < graph.length; j++) {
                if (graph[j][0] == x) {
                    indegree[graph[j][1]]--;
                }
            }
        }
    }

    public static int getZeroIndegree(int n, int[] indegree) {
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
