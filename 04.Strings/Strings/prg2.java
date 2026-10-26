public class prg2 {
    public static void main(String[] args) {
        String s1="java";
        String s2="java";
        String s3=new String("java");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.print(s1.equals(s3));
    }
}
//String Pool
//The String pool is an area managed
//by the JVM for reusing String literals.
//Explanation:
//
//s1 and s2 refer to the same pooled String literal.
//s3 refers to a separately created String object.
//The intern() method can return the canonical pooled
// representation of a String.




//== checks whether two references point to the same object.
//
//equals() checks whether two Strings contain the same
// sequence of characters.
//
//String literals can refer to the same pooled object.
//
//new String("Java") creates a distinct String object.
//
//Remember: Use equals() to compare String contents.
