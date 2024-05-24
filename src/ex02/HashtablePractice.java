package ex02;

import java.util.Hashtable;

public class HashtablePractice {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 3, 2, 3, 2};

        // Hashtable 선언
        Hashtable<Integer, Integer> cnt = new java.util.Hashtable<>();
        for (int i = 0; i < n; i++) {
            cnt.put(arr[i], cnt.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 1; i <= 100000; i++) {
            if (cnt.get(i) != null && cnt.get(i) >= 2) {
                System.out.println(i);
            }
        }
    }
}
