public class kadensBruteforece {
    public static void main(String[] args) {
        int[] nums={-1,3,5,-7,9,10};
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                maxSum=Math.max(sum,maxSum);
            }
        }
        System.out.println(maxSum);
    }
}
