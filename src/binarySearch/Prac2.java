package binarySearch;

public class Prac2 {
    static int[] arr = {1, 3, 5, 7, 8, 10, 20, 35, 99, 100};
    public static void main(String[] args) {
        //순환 호출
        System.out.println(binarySearch1(5, 0, arr.length - 1));
    }

    public static int binarySearch1(int key, int low, int high) {
        int mid;

        if(low <= high) {
            mid = (low + high) / 2;

            if(key == arr[mid]) {
                return mid;
            } else if(key < arr[mid]) {
                return binarySearch1(key ,low, mid-1);
            } else {
                return binarySearch1(key, mid+1, high);
            }
        }

        return -1;
    }
}
