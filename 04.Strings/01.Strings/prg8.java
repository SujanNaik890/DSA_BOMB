public class prg8 {
    public static void main(String[] args) {
        String s1="King Cobra";
        String s2="Cobra";
        String s3="COBRA";

        System.out.println(s1.contains(s2));
        System.out.println(s1.contains(s3));

        System.out.println(s1.startsWith("Ki"));
        System.out.println(s1.endsWith(s2));

        System.out.println(s1.indexOf(s2));

        String s4="banana";

        System.out.println(s4.lastIndexOf('a'));


    }
}
