public class capacity {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();//default capacity=16
        System.out.println(sb.capacity());//16
        sb.append("Java");
        System.out.println(sb);
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//4 length

        StringBuilder sb1=new StringBuilder(3);
        System.out.println(sb1.capacity());

        StringBuilder sb2=new StringBuilder("java");
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
    }
}
