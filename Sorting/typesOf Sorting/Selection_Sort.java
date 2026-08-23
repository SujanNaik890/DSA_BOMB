import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 2, 8, 1, 9};
        for (int i = 0; i < arr.length - 1; i++) {
            int pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[pos]) pos = j;
            }
            swap(arr, i, pos);
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
/*  not stable
    inplace
    Best: O(n²)
    Average: O(n²)
    Worst: O(n²)
    Space: O(1)
 */
