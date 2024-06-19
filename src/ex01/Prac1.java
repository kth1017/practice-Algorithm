package ex01;

public class Prac1 {
    public static void main(String[] args) {
        int n = 25;
        int k = 3;
        int result = 0;

        while (true) {
            int target = (n / k) * k;
            result += (n - target);
            n = target;

            if (n < k) {
                break;
            }

            result++;
            n /= k;
        }

        result += (n - 1);
        System.out.println(result);
    }
}
