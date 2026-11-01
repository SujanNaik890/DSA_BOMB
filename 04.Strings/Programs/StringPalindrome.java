public class StringPalindrome {
    public static void main(String[] args) {
        String s="malayalam";
        s=s.toLowerCase();

        boolean palindrome=false;
        int left=0;

        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=(s.charAt(right))){
                palindrome=true;
            }
            left++;
            right--;
        }
        if(palindrome){
            System.out.println("Not Palindrome");
        }
        else System.out.println("Palindrome");
    }
}
