import java.util.Arrays;

public class MinimizeHeights {
    public static void main(String[] args) {
        int[] arr={1,5,8,10};
        int k=2;
        int i=0;
        while(i<k-1){
            arr[i]=arr[i]+k;
            i++;
        }
        for( i=k-1;i<arr.length;i++){
            arr[i]=arr[i]-k;
        }
        System.out.println(Arrays.toString(arr));
        int max=Integer.MIN_VALUE;int min=Integer.MAX_VALUE;
        for(int num:arr){
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
        System.out.println(max+" "+min);
    }
}
