package Generics.Bounds;
class Box<T> {
    T value;

    Box(T value) {
        this.value = value;
    }
}

public class LowerBoundGenerics {

    static void addNumber(Box<? super Integer> box) {
        box.value = 50;
        System.out.println("Value added successfully!");
    }

    public static void main(String[] args) {

        Box<Integer> b1 = new Box<>(10);
        Box<Number> b2 = new Box<>(20.5);
        Box<Object> b3 = new Box<>("Hello");

        addNumber(b1);
        addNumber(b2);
        addNumber(b3);

        System.out.println("b1: " + b1.value);
        System.out.println("b2: " + b2.value);
        System.out.println("b3: " + b3.value);
    }
}