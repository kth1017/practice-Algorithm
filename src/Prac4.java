public class Prac4 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 3, 2, 3, 2};

        int[] cnt = new int[100001];
        for (int i = 0; i < n; i++) {
            cnt[arr[i]] += 1;
        }

        for (int i = 1; i <= 100000; i++) {
            if (cnt[i] >= 2) {
                System.out.println(i);
            }
        }
    }






}
