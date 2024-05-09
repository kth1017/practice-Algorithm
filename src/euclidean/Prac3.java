package euclidean;

public class Prac3 {
    // gcd를 사용하지 않는 lcm 예제
    public static void main(String[] args) {
        System.out.println(lcm(5, 6));
    }

    public static int lcm(int a, int b) {
        int result = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for (int i = 1; i <= min; i++) {
            if ((max * i) % min == 0) {
                result = max * i;
                break;
            }
        }

        return result;
    }
}
