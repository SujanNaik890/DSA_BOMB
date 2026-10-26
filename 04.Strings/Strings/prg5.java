import java.util.Scanner;

public class prg5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your full name:");
        String name=sc.next();
//        next() reads the next token, stopping at whitespace.
        System.out.println(name);

        sc.nextLine();// this one i have added because when i typed my full name the
        //next take the input till the whitespaces and stops but the another nextLine
        // takes all the other input and print the result instead not allowing to enter the string value

         System.out.println();
        System.out.print("Enter your full name:");
        String name1=sc.nextLine();
//        nextLine() reads the remaining line, including spaces.
        System.out.println(name1);
    }
}
