import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s=new String("Sujan ");
        String s1="Sujan Naik";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.length());
        System.out.println(s.getBytes());
        System.out.println(s.compareTo("Sujan"));
        System.out.println(s.codePointBefore(1));
        System.out.println(s.codePointAt(1));
        System.out.println(s.chars());
        System.out.println(s.trim());
        System.out.println(s.equals("Sujan"));
        System.out.println(s.equals(s1));
        System.out.println(s==s1);
        System.out.println(s1=="Sujan");
        System.out.println(s==s1);
        System.out.println(s.endsWith("an"));
        System.out.println(s.concat(s1));
        System.out.println(s+s1);
        System.out.println(s.indexOf("S"));
        System.out.println(s.contains("u"));
        System.out.println("S".matches(s)); //search in chstgpt
        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());
        System.out.println(s.replace("S","s"));
        System.out.println(s.replaceAll(" "," Naik"));
        System.out.println(s.strip());
        System.out.println(s.substring(1));
        System.out.println(s.substring(1,4));
        System.out.println(s.toCharArray());
        System.out.println(Arrays.toString(" ".split(s1)));
        System.out.println(s.getClass());

    }
}