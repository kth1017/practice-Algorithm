package ex02;


import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapPractice {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 3, 2, 3, 2};


        ConcurrentHashMap<Integer, Integer> cnt = new java.util.concurrent.ConcurrentHashMap<>();
        for (int i = 0; i < n; i++) {
            cnt.put(arr[i], cnt.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 1; i <= 100000; i++) {
            if (cnt.get(i) != null && cnt.get(i) >= 2) {
                System.out.println(i);
            }
        }
    }

    public static void testMapSpeed() {
        int n = 1000000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 100000);
        }

        long start = System.currentTimeMillis();
        ConcurrentHashMap<Integer, Integer> cnt = new java.util.concurrent.ConcurrentHashMap<>();
        for (int i = 0; i < n; i++) {
            cnt.put(arr[i], cnt.getOrDefault(arr[i], 0) + 1);
        }
        long end = System.currentTimeMillis();
        System.out.println("ConcurrentHashMap: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        java.util.Hashtable<Integer, Integer> cnt2 = new java.util.Hashtable<>();
        for (int i = 0; i < n; i++) {
            cnt2.put(arr[i], cnt2.getOrDefault(arr[i], 0) + 1);
        }
        end = System.currentTimeMillis();
        System.out.println("Hashtable: " + (end - start) + "ms");
    }









}
