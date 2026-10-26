import java.util.Arrays;

public class LeftRotateByk {
    public static void main(String[] args) {
        int[] num={8,2,4,5,6,7};
        int k=3;
//        int i=0;
//        while(i<k){
////        reverse(num);
//        i++;
//        }
        int n=num.length;
        k%=n;
        reversed(num,0,k-1);
        reversed(num,k,n-1);
        reversed(num,0, n-1);
        System.out.println(Arrays.toString(num));
    }
//    private static void reverse(int[] num){
//       wj
//    }
    private static void reversed(int[] num,int start,int end){
        while(start <end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
        }
    }
}
