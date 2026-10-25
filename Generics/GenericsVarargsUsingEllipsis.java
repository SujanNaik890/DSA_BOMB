package Generics;

public class GenericsVarargsUsingEllipsis {
    @SafeVarargs
    static <T> void display(T... values) {
        for (T value : values) {
            System.out.print(value+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        display(10, 20, 30);
        display("Java", "Python", "C++");
        display(1.5, 2.5, 3.5);
    }
}
