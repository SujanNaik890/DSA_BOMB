import java.lang.StringBuffer;

public class StringBufferjava {
    public static void main(String[] args) {
        StringBuffer sf=new StringBuffer("Sujan naik");
        StringBuffer sf1=new StringBuffer("Sujan naik");
        System.out.println(sf);
        System.out .println(sf.append(" anna"));
        System.out.println(sf.indexOf("a"));
        System.out.println(sf.capacity());
        System.out.println(sf.insert( 15," naveen"));
        System.out.println(sf.charAt(1));
        System.out.println(sf.isEmpty());
        System.out.println(sf.compareTo(sf1));
        System.out.println("Sujan naik".equals(sf1));
        System.out.println(sf.equals(sf1));
        System.out.println(sf.delete(0,5));
        System.out.println(sf.replace(1,5,"Sujan"));
        System.out.println(sf.substring(1,6));
        System.out.println(sf.reverse());
        System.out.println(sf.length());
    }
}
