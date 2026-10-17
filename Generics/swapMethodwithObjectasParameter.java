package Generics;

class Person {
    String name;
    float marks;

    Person(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }

    // Added toString() so print statements display the object's details
    @Override
    public String toString() {
        return "Person [name=" + name + ", marks=" + marks + "]";
    }
}

class swapMethodwithObjectasParameter {
    // Using an array container so changes are reflected outside the method
    public static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        // Wrapping the objects in an array container
        Object[] p = {
                new Person("Rahul", 66.6f),
                new Person("rahul", 100.0f)
        };

        System.out.println("Before swap: p1 = " + p[0] + ", p2 = " + p[1]);

        swap(p, 0, 1);

        System.out.println("After swap: p1 = " + p[0] + ", p2 = " + p[1]);
    }
}