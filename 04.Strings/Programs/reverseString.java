public class reverseString {
    public static void main(String[] args) {
        String s="Sujan Naik";
        String reversed="";
        for(int i=s.length()-1;i>=0;i--){//step 1
            reversed +=s.charAt(i);
        }
        String rev =new StringBuilder(s).reverse().toString();//step 2
        System.out.println(s.toLowerCase()+"\n"+reversed.toLowerCase()+"\n"+ rev.toLowerCase());
    }
}
