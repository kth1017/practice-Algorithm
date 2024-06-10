package ex02;

public class DynamicPractice1 {
    public static void main(String[] args) {
        int n = 3;
        int[] w = {10, 15, 20};
        int[] v = {10, 20, 30};
        int capacity = 30;

        double[] perUnit = new double[n];
        for (int i = 0; i < n; i++) {
            perUnit[i] = (double) v[i] / w[i];
        }

        double result = 0;
        while (capacity > 0) {
            int maxIndex = 0;
            for (int i = 1; i < n; i++) {
                if (perUnit[i] > perUnit[maxIndex]) {
                    maxIndex = i;
                }
            }

            if (w[maxIndex] <= capacity) {
                result += v[maxIndex];
                capacity -= w[maxIndex];
                perUnit[maxIndex] = 0;
            } else {
                result += perUnit[maxIndex] * capacity;
                break;
            }
        }

        System.out.println(result);
    }
}
