package Generics;
class GenericClasstwoparameter <T1,T2> {
   T1 a;
   T2 b;
   GenericClasstwoparameter(T1 a,T2 b){
       this.a=a;
       this.b=b;
   }
   void display(){
       System.out.print(((Number) a).doubleValue()
               + ((Number) b).doubleValue());
   }
}
//1. Why do we use Number?
//In this code:
//        ((Number) a).doubleValue()
//
//
//Number is a built-in abstract class in Java that is
// the parent class of numeric wrapper classes such as:
//        - Integer
//- Double
//- Float
//- Long
//- Short
//- Byte
//It provides methods such as doubleValue() to convert a number into a double.
//        2. Example without Number
//Suppose you write:
//class Addition<T, U> {
//    T a;
//    U b;
//
//    Addition(T a, U b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    void add() {
//        System.out.println(a + b); // Error
//    }
//}
//
//
//Why error?
//Java doesn't know what T and U represent. They could be Integer,
// String, or other objects, so Java cannot assume that + means numeric addition.
//        3. Example using Number
//class Addition<T, U> {
//    T a;
//    U b;
//
//    Addition(T a, U b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    void add() {
//        System.out.println(
//                ((Number) a).doubleValue()
//                        + ((Number) b).doubleValue()
//        );
//    }
//}
//
//
//Now, if a = 10 and b = 20.5, the result is 30.5.
//However, this version uses type casting. If either value
// isn't a numeric object, it will throw a ClassCastException at runtime.
//        4. Better approach: Use a generic bound
//Instead of casting, you can restrict both generic types to numeric types:
//class Addition<T extends Number, U extends Number> {
//
//    T a;
//    U b;
//
//    Addition(T a, U b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    void add() {
//        System.out.println(
//                a.doubleValue() + b.doubleValue()
//        );
//    }
//}
public class GenericClasswithTwoParameter {
    public static void main(String[] args) {
        GenericClasstwoparameter two=new GenericClasstwoparameter(12,13);
        two.display();
    }
}
