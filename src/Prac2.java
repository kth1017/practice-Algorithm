public class Prac2 {
    public static void main(String[] args) {
        int n = 15;
        int m = 12;
        int[] parent = {
            0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5
        };

        System.out.println(lca(3, 4, parent));
        System.out.println(lca(6, 11, parent));
        System.out.println(lca(13, 9, parent));
        System.out.println(lca(7, 10, parent));
    }

    public static int lca(int a, int b, int[] parent) {
        int[] pathA = new int[100];
        int[] pathB = new int[100];
        int indexA = 0;
        int indexB = 0;

        while (true) {
            pathA[indexA++] = a;
            if (a == 0) {
                break;
            }
            a = parent[a];
        }

        while (true) {
            pathB[indexB++] = b;
            if (b == 0) {
                break;
            }
            b = parent[b];
        }

        for (int i = 0; i < indexA; i++) {
            for (int j = 0; j < indexB; j++) {
                if (pathA[i] == pathB[j]) {
                    return pathA[i];
                }
            }
        }

        return -1;
    }
}
