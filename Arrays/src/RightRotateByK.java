import java.util.Arrays;

public class RightRotateByK {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6};
        int i=0,k=4;
        while(i<k){
           reverse(num);
           i++;
       }
        System.out.println(Arrays.toString(num));
    }
    private  static void reverse(int[] num){
        int last=num[num.length-1];
        for(int i=num.length-1;i>0;i--){
            num[i]=num[i-1];
        }
        num[0]=last;
    }
}
