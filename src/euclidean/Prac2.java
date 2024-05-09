package euclidean;

public class Prac2 {
    // gcd를 사용한 lcm 예제
    public static void main(String[] args) {
        System.out.println(lcm(5, 6));
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }


}
