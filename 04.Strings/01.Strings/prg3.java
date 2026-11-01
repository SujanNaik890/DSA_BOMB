public class prg3 {
    public static void main(String[] args) {

        String s = "Hello";

        s.concat(" World");

        System.out.println(s);


        System.out.println(" ");
        String s1 = "Hello";

        s1 = s1.concat(" World");

        System.out.println(s1);


    }
}
//Strings in Java are immutable, meaning that once a String
//object is created, its contents cannot be changed.
//
//The concat() method returns a new String. It does not
//modify the original String
//
//Advantages of String immutability:
//
//Improves security for text values.
//Makes String objects safe to share between different parts of a program.
//Allows String literals to be reused.
//Helps Java cache String hash codes.