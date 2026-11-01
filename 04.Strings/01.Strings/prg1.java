public class prg1 {
    public static void main(String[] args) {
        String myString="Joy with Java ";
        System.out.println(myString);
        System.out.println("Welcome "+myString);
        String doubled=myString + myString;
//        instead use concat
        System.out.println(doubled);
    }
}
