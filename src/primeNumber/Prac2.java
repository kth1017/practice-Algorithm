package primeNumber;

import java.util.*;

public class Prac2 {
    // 대칭으로 인한 n^1/2 개선
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(4));
        System.out.println(isPrimeNumber(7));
    }

    public static boolean isPrimeNumber(int x) {
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
