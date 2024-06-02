package ex03;

public class CountingSortPractice {
    void sort(int arr[]) {
        int n = arr.length;

        int output[] = new int[n];

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int count[] = new int[max + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {1, 4, 1, 2, 7, 5, 2};
        CountingSortPractice ob = new CountingSortPractice();
        ob.sort(arr);

        System.out.println("Sorted array is ");
        printArray(arr);
    }
}