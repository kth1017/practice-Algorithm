package ex03;

public class KMPPractice {
    public static void main(String[] args) {
        String s = "ababacabacaabacaaba";
        String p = "abacaaba";

        int[] pi = getPi(p);
        int n = s.length();
        int m = p.length();
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j > 0 && s.charAt(i) != p.charAt(j)) {
                j = pi[j - 1];
            }

            if (s.charAt(i) == p.charAt(j)) {
                if (j == m - 1) {
                    System.out.println(i - m + 1);
                    j = pi[j];
                } else {
                    j++;
                }
            }
        }
    }

    public static int[] getPi(String p) {
        int m = p.length();
        int j = 0;
        int[] pi = new int[m];

        for (int i = 1; i < m; i++) {
            while (j > 0 && p.charAt(i) != p.charAt(j)) {
                j = pi[j - 1];
            }

            if (p.charAt(i) == p.charAt(j)) {
                pi[i] = ++j;
            }
        }

        return pi;
    }
}
