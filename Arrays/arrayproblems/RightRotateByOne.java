import java.util.Arrays;

public class RightRotateByOne {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6};
        int last=num[num.length-1];
        for(int i=num.length-1;i>0;i--){
            num[i]=num[i-1];
        }
        num[0]=last;
        System.out.println(Arrays.toString(num));
    }
}
