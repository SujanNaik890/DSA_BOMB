import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.SocketOption;
import java.util.Locale;

public class prg6 {
    public static void main(String[] args) {
        String s="  Hello World   ";
        System.out.println(s.length());

        s=s.trim();//remove the leading and trailing whitespaces
        System.out.println(s);

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());


//        substring(beginIndex)
//        substring(beginIndex, endIndex)
        String s2=s.substring(1,7);
        String s3=s.substring(1);

        System.out.println(s2);
        System.out.println(s3);


        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }

        String str1="Hello java";
        String str2="HELLO JAVA";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

    }
}
