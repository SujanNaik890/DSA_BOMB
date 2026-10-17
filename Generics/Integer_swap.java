package Generics;

public class Integer_swap {
    public static <T> void swap(T a,T b){
        T t;
        t=a;
        a=b;
        b=t;
    }
    public static void main(String[] args) {
        int x=10;
        int y=20;
        System.out.println("Before Swapping"+"x"+x+"y"+y);
        swap(x,y);
        System.out.println("After Swapping"+"x"+x+"y"+y);
//        the original x and y variables back in main
//        remain completely untouched! Because Integer
//        objects are immutable (their internal values cannot be
//                changed once created), you cannot swap references using
//        simple local variable reassignments like this.

    }
}
