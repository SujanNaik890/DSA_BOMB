public class kadensalgo {
    public static void main(String[] args) {
        int[] nums={-1,3,5,-7,9,10};
        int maxSum=nums[0];
        int currentSum=0;
        for(int n:nums){
            currentSum+=n;
            if(currentSum>maxSum)maxSum=currentSum;
            if(currentSum<0)currentSum=0;;
        }
        System.out.println(maxSum);
    }
}