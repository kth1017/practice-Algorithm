package ex03;

public class ExponentiationPractice {
    public static long power(long x, long n) {
        if (n == 0) {
            return 1;
        }

        long half = power(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static long power2(long x, long n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

}
