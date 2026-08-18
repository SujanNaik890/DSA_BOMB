public class StringBuilderjava {
    public static void main(String[] args) {
       StringBuilder sb=new StringBuilder("hello world");
        StringBuilder sb1=new StringBuilder("hello world");
       System.out.println(sb.compareTo(sb1));
       System.out.println(sb.equals(sb1));
       System.out.println(sb.insert(0,"c"));
       System.out.println(sb.indexOf("l"));
       System.out.println(sb.append("Sujan"));System.out.println(sb.length());
       System.out.println(sb.subSequence(1,7));
       System.out.println(sb.substring(1,7));
       System.out.println(sb.capacity());
       System.out.println(sb.lastIndexOf("c"));
       System.out.println(sb.reverse());
       System.out.println(sb.replace(1,5,"gandu"));
       System.out.println(sb.isEmpty());
       System.out.println(sb.delete(1,7));
       System.out.println(sb.deleteCharAt(6));
    }
}
