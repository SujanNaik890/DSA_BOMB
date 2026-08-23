import java.util.Arrays;

public class BruteforceSorting {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 3, 1, 9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
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
