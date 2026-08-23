import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 2, 8, 1, 9};
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) swap(arr, j, j + 1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
/*
Best: O(n) with optimization
Average: O(n²)
Worst: O(n²)
Space: O(1)
Stable: ✅
 */