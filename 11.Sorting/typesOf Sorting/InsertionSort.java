import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {

                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }
}
/*
INSERTION SORT TRACING
Array = [5, 3, 4, 1, 2]
PASS 1
i = 1
key = arr[1] = 3
j = i - 1 = 0
Array = [5, 3, 4, 1, 2]
arr[j] > key
5 > 3 → True
Shift:
arr[j + 1] = arr[j]
Array = [5, 5, 4, 1, 2]
j--
j = -1
Insert key at arr[j + 1]
Array = [3, 5, 4, 1, 2]
PASS 2
i = 2
key = arr[2] = 4
j = 1
Array = [3, 5, 4, 1, 2]
5 > 4 → True
Shift 5:
Array = [3, 5, 5, 1, 2]
j = 0
3 > 4 → False
Insert key at arr[j + 1]
Array = [3, 4, 5, 1, 2]
PASS 3
i = 3
key = arr[3] = 1
j = 2
Array = [3, 4, 5, 1, 2]
5 > 1 → True
Shift:
[3, 4, 5, 5, 2]
j = 1
4 > 1 → True
Shift:
[3, 4, 4, 5, 2]
j = 0
3 > 1 → True
Shift:
[3, 3, 4, 5, 2]
j = -1
Insert key:
Array = [1, 3, 4, 5, 2]
PASS 4
i = 4
key = arr[4] = 2
j = 3
Array = [1, 3, 4, 5, 2]

5 > 2 → True
Shift:
[1, 3, 4, 5, 5]
j = 2
4 > 2 → True
Shift:
[1, 3, 4, 4, 5]
j = 1
3 > 2 → True
Shift:
[1, 3, 3, 4, 5]
j = 0
1 > 2 → False
Insert key at arr[j + 1]
FINAL ARRAY:
[1, 2, 3, 4, 5]
 */
