package ex02;

public class RKPractice {
    public static void main(String[] args) {
        String str = "ababacabacaabacaaba";
        String pattern = "abacaaba";

        int n = str.length();
        int m = pattern.length();
        int d = 26;
        int q = 13;

        int h = 1;
        for (int i = 0; i < m - 1; i++) {
            h = (h * d) % q;
        }

        int p = 0;
        int t = 0;
        for (int i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + str.charAt(i)) % q;
        }

        for (int i = 0; i <= n - m; i++) {
            if (p == t) {
                boolean flag = true;
                for (int j = 0; j < m; j++) {
                    if (str.charAt(i + j) != pattern.charAt(j)) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    System.out.println(i);
                }
            }

            if (i < n - m) {
                t = (d * (t - str.charAt(i) * h) + str.charAt(i + m)) % q;
                if (t < 0) {
                    t += q;
                }
            }
        }
    }
}
