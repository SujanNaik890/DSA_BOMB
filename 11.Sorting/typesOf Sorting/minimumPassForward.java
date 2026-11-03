import java.util.Arrays;

public class minimumPassForward {
    public static void main(String[] args) {
        int[] arr={9,5,3,7,2,8};
        for (int i = 0; i < arr.length - 1; i++) {
            int min= i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min]>arr[j]) {
                    min = j;
                }
            }
            swap(arr, min, i);
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
