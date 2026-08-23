import java.util.Arrays;
public class QuickSort {
    static int pivotIndex(int[] arr,int low ,int high){
         int pivot=arr[high];
         int i=low -1;
         for(int j=low ;j<high;j++){
             if(arr[j]<pivot){
                 i++;
                 swap(arr,i,j);
             }
         }

         swap(arr,i+1,high);
        return i+1;
    }
    static void quicksort(int[] arr,int low ,int high){
        if(low<high){
        int pivot=pivotIndex(arr,low ,high);
        quicksort(arr,low ,pivot-1);
        quicksort(arr,pivot+1,high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        quicksort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    static  void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
/*
Sure 👍 Here are the **important notes + remembering formulas** for **Quick Sort** in one copyable format:

```text
QUICK SORT

Quick Sort is a Divide and Conquer sorting algorithm.

MAIN STEPS:

1. Choose a Pivot.
2. Partition the array.
3. Put smaller elements on the left of the Pivot.
4. Put larger elements on the right of the Pivot.
5. The Pivot reaches its correct position.
6. Recursively sort the left part.
7. Recursively sort the right part.

DIVIDE AND CONQUER:

DIVIDE
Break the problem into smaller parts.

CONQUER
Solve the smaller parts recursively.

COMBINE
The sorted parts form the final sorted array.

REMEMBERING FORMULA:

PIVOT
  ↓
PARTITION
  ↓
SORT LEFT
  ↓
SORT RIGHT

SHORT FORMULA:

Quick Sort = Pivot → Partition → Left Recursion → Right Recursion


PARTITION FORMULA:

pivot = arr[high]

i = low - 1

for j = low to high - 1

    if arr[j] < pivot
        i++
        swap(arr[i], arr[j])

swap(arr[i + 1], arr[high])

return i + 1


QUICKSORT FORMULA:

if (low < high)

    pivotIndex = partition(arr, low, high)

    quickSort(arr, low, pivotIndex - 1)

    quickSort(arr, pivotIndex + 1, high)


IMPORTANT POINTS:

Pivot = Element used to divide the array.

Smaller elements → Left side

Larger elements → Right side

Pivot → Correct position after partition.

RECURSION STOPS WHEN:

low >= high


TIME COMPLEXITY:

Best Case    = O(n log n)

Average Case = O(n log n)

Worst Case   = O(n²)


SPACE COMPLEXITY:

O(log n) average due to recursion stack.


ONE LINE TO REMEMBER:

QUICK SORT = CHOOSE PIVOT → PARTITION → SORT LEFT → SORT RIGHT
```

QUICK SORT TRACING

Array = [5, 3, 8, 4, 2]

quickSort(arr, low = 0, high = 4)


--------------------------------------------------
PARTITION 1
--------------------------------------------------

Array = [5, 3, 8, 4, 2]

low = 0
high = 4

pivot = arr[4] = 2

i = low - 1
i = -1


j = 0

arr[0] = 5

5 < 2 → False

No swap

Array = [5, 3, 8, 4, 2]


j = 1

arr[1] = 3

3 < 2 → False

No swap

Array = [5, 3, 8, 4, 2]


j = 2

arr[2] = 8

8 < 2 → False

No swap

Array = [5, 3, 8, 4, 2]


j = 3

arr[3] = 4

4 < 2 → False

No swap

Array = [5, 3, 8, 4, 2]


FOR LOOP FINISHED

i = -1

Now swap:

swap(arr[i + 1], arr[high])

swap(arr[0], arr[4])

Swap 5 and 2

Array = [2, 3, 8, 4, 5]

Pivot 2 is now at index 0

pivotIndex = 0


--------------------------------------------------
RECURSIVE CALLS
--------------------------------------------------

quickSort(arr, 0, -1)

low >= high

STOP


quickSort(arr, 1, 4)


--------------------------------------------------
PARTITION 2
--------------------------------------------------

Array = [2, 3, 8, 4, 5]

low = 1
high = 4

pivot = arr[4] = 5

i = low - 1
i = 0


j = 1

arr[1] = 3

3 < 5 → True

i++
i = 1

swap(arr[1], arr[1])

Array = [2, 3, 8, 4, 5]


j = 2

arr[2] = 8

8 < 5 → False

No swap


j = 3

arr[3] = 4

4 < 5 → True

i++
i = 2

swap(arr[2], arr[3])

Swap 8 and 4

Array = [2, 3, 4, 8, 5]


FOR LOOP FINISHED

Now swap:

swap(arr[i + 1], arr[high])

swap(arr[3], arr[4])

Swap 8 and 5

Array = [2, 3, 4, 5, 8]

Pivot 5 is now at index 3

pivotIndex = 3


--------------------------------------------------
RECURSIVE CALLS
--------------------------------------------------

quickSort(arr, 1, 2)

quickSort(arr, 4, 4)

For quickSort(arr, 4, 4):

low >= high

STOP


--------------------------------------------------
PARTITION 3
--------------------------------------------------

Array = [2, 3, 4, 5, 8]

low = 1
high = 2

pivot = arr[2] = 4

i = low - 1
i = 0


j = 1

arr[1] = 3

3 < 4 → True

i++
i = 1

swap(arr[1], arr[1])

Array = [2, 3, 4, 5, 8]


FOR LOOP FINISHED

swap(arr[i + 1], arr[high])

swap(arr[2], arr[2])

Pivot 4 is at index 2

Array = [2, 3, 4, 5, 8]


--------------------------------------------------
FINAL RECURSIVE CALLS
--------------------------------------------------

quickSort(arr, 1, 1)

low >= high

STOP


quickSort(arr, 3, 2)

low >= high

STOP


--------------------------------------------------
FINAL SORTED ARRAY
--------------------------------------------------

[2, 3, 4, 5, 8]


REMEMBER THE FLOW:

[5, 3, 8, 4, 2]

Pivot = 2
        ↓

[2, 3, 8, 4, 5]

Pivot = 5
        ↓

[2, 3, 4, 5, 8]

Pivot = 4
        ↓

[2, 3, 4, 5, 8]


QUICK SORT FORMULA:

Choose Pivot
      ↓
Partition
      ↓
Pivot gets correct position
      ↓
Sort Left Part
      ↓
Sort Right Part
      ↓
Repeat until low >= high
 */