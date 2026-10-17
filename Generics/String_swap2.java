package Generics;

public class String_swap2 {
        public static <T> void swap(T[] arr, int i, int j) {
            T temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static void main(String args[]) {
            String[] values = {"99", "66"};

            System.out.println("Before Swapping: x = " + values[0] + ", y = " + values[1]);
            swap(values, 0, 1);
            System.out.println("After Swapping: x = " + values[0] + ", y = " + values[1]);
        }
    }