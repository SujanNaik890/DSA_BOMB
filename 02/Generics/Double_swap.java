package Generics;

public class Double_swap {
    public static <T> void swap(T a, T b) {
        T t;
        t = a;
        a = b;
        b = t;
    }

    public static void main(String[] args) {
//        double x=10;
//        double y=20;
        Double x = new Double(12.0);
        Double y = new Double(24.0);
        System.out.println("Before Swapping" + "x" + x + "y" + y);
        swap(x, y);
        System.out.println("After Swapping" + "x" + x + "y" + y);
//        Java is strictly pass-by-value: When you call swap(x, y),
//        Java creates local copies of the object references and
//        assigns them to parameters a and b.
//
//        Local Reassignments Have No Effect:
//        Inside the method, reassigning t = a, a = b, and b = t only
//        shuffles the local variables around.It
//        changes which objects the local parameters point to, but it
//        has zero effect on the original x and y variables back in main.
//
//        Integer Objects Are Immutable: Once
//        an Integer object is created (like new Integer(12)), its
//        internal value can never be modified. You
//        cannot change the actual number stored inside the heap object;
//        you can only change references—which, again, only affects
//        the local copies inside the swap method.
    }
}
