package Generics;

public class Double_swap2 {
    // Generic method to swap elements inside an array container
    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        // Wrapping the Double values in an array
        Double[] numbers = {99.0, 66.0};

        System.out.println("Before Swapping: x = " + numbers[0] + ", y = " + numbers[1]);

        // Swap the elements at index 0 and 1
        swap(numbers, 0, 1);

        System.out.println("After Swapping: x = " + numbers[0] + ", y = " + numbers[1]);
    }
}