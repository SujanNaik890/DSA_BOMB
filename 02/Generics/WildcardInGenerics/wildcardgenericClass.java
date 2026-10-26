package Generics.WildcardInGenerics;
//problem can be solved by using another feature of
//Java generics called the
//wildcard argument.
class Box<T> {
    T value;

    Box(T value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value: " + value);
    }
}


public class wildcardgenericClass {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(100);
        Box<String> b2 = new Box<>("Hello");

        Box<?> b3 = b1;
        Box<?> b4 = new Box<>("sujan");

        b1.display();
        b2.display();
        
        b3.display();
        b4.display();
    }
}
