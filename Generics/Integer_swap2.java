package Generics;

public class Integer_swap2 {
        // Using an array container so changes are reflected outside the method
        public static <T> void swap(T[] arr, int i, int j) {
            T temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static void main(String[] args) {
            // Wrapping the integers in an array
            Integer[] numbers = {12, 24};

            System.out.println("Before Swapping: x = " + numbers[0] + ", y = " + numbers[1]);

            swap(numbers, 0, 1);

            System.out.println("After Swapping: x = " + numbers[0] + ", y = " + numbers[1]);
        }
}

