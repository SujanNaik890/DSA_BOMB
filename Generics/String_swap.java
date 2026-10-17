class String_swap {
    public static <T> void swap(T x, T y) {
        T temp;
        temp = x;
        x = y;
        y = temp;
    }

    public static void main(String args[]) {
        String x = "99";
        String y = "66";

        System.out.println("Before Swapping: x = " + x + ", y = " + y);
        swap(x, y);
        System.out.println("After Swapping: x = " + x + ", y = " + y);
    }
}
//Before Swapping: x = 99, y = 66
//After Swapping: x = 99, y = 66
//
//Why it was not swapped:
//        1. Java is Pass-by-Value: When you pass x and y to the swap method, Java only
//sends copies of their references. Inside the method, temp = x, x = y, and y =
//        temp only swap the local copies (x and y parameters inside the method),
//leaving the original x and y variables in main completely untouched.
//        2. String Immutability: String objects in Java are immutable.
//Their internal values cannot be modified once created, so any attempt to
//change them via local method parameters will not affect the original strings.