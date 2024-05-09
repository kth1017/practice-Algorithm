package greedy;

public class Prac1 {
    public static void main(String[] args) {
        int n = 1260;
        int count = 0;
        int[] coinTypes = {500, 100, 50, 10};

        for (int coin : coinTypes) {
            count += n / coin;
            n %= coin;
        }

        System.out.println(count);
    }
}
