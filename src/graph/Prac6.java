package graph;

import java.util.Arrays;

public class Prac6 {
    public static void main(String[] args) {
        int n = 7;
        int m = 9;
        int[][] edges = {
            {1, 2, 29},
            {1, 5, 75},
            {2, 3, 35},
            {2, 6, 34},
            {3, 4, 7},
            {4, 6, 23},
            {4, 7, 13},
            {5, 6, 53},
            {6, 7, 25}
        };

        System.out.println(kruskal(n, m, edges));
    }

    public static int kruskal(int n, int m, int[][] edges) {
        int result = 0;
        int[] parent = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            parent[i] = i;
        }

        Arrays.sort(edges, (a, b) -> a[2] - b[2]);

        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            int cost = edge[2];

            if (findParent(parent, a) != findParent(parent, b)) {
                unionParent(parent, a, b);
                result += cost;
            }
        }

        return result;
    }

    public static int findParent(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = findParent(parent, parent[x]);
        }

        return parent[x];
    }

    public static void unionParent(int[] parent, int a, int b) {
        a = findParent(parent, a);
        b = findParent(parent, b);

        if (a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }
}
