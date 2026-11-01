
public class prgm1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.insert(0,"sujan niak");
        System.out.println(sb);
        sb.insert(6,"Honavar");
        System.out.println(sb);//sujan Honavarniak
        sb.replace(6,sb.length(),"honavar");//sujan honavar
        System.out.println(sb);
//        sb.append(" naveen",0,7);sujan honavar naveen
//        sb.append(" naveen",0,5);sujan honavar nave
        sb.append(" naveen",1,7);//sujan honavarnaveen
        System.out.println(sb);
        sb.delete(13,sb.length());//sujan honavar
        System.out.println(sb);
        sb.deleteCharAt(5);//sujanhonavar
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        //sb.reverse(5,sb.length());error cannot reverse particular string

    }
}
