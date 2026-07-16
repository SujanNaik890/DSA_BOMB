import java.util.Arrays;

public class LeftRotateByk {
    public static void main(String[] args) {
        int[] num={8,2,4,5,6,7};
        int k=3;
        int i=0;
        while(i<k){
        reverse(num);
        i++;
        }
        int n=num.length;
//        k%=n;
//        reversed(num,0,k-1);
//        reversed(num,k,n-1);
//        reversed(num,0, n-1);
        System.out.println(Arrays.toString(num));
    }
    private static void reverse(int[] num){
        int first=num[0];
        for(int i=0;i< num.length-1;i++){
            num[i]=num[i+1];
        }
        num[num.length-1]=first;
    }
//    private static void reversed(int[] num,int start,int end){
//        int first=num[start];
//        for(int i=start;i<end;i++){
//            num[i]=num[i+1];
//        }
//        num[end]=first;
//    }
}
