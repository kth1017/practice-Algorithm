package euclidean;

public class Prac1 {
    // gcd 예제
    public static void main(String[] args) {
        System.out.println(gcd(12, 16));
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}
