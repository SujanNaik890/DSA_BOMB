import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6};
        int left=0;
        int right=num.length-1;
        while(left<right){
            int temp=num[left];
            num[left]=num[right];
            num[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(num));
    }
}
