import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] num={8,2,4,5,6,7};
        int first=num[0];
        for(int i=0;i< num.length-1;i++){
            num[i]=num[i+1];
        }
        num[num.length-1]=first;
        System.out.println(Arrays.toString(num));
    }
}
