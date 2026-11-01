import java.util.Scanner;

public class CountOfVowelAndConsonants {
    public static void main(String[] args) {
        int vowels=0;
        int consonants=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        for(char ch:s.toLowerCase().toCharArray()){
            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
       System.out.println(vowels);System.out.println(consonants);

    }
}
