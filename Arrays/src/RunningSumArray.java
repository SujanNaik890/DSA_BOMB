import java.util.Arrays;

public class RunningSumArray {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9};
        int[] sum=new int[num.length];
        sum[0]=num[0];
        for(int i=1;i< num.length;i++){
            sum[i]=sum[i-1]+num[i];
        }
        System.out.println(Arrays.toString(sum));
    }
}
