public class MaximumAbsoluteSumofAnySubarray {
    public static void main(String[] args) {
        int nums[]={2,3,-2,4};
        int f = 0, g = 0;
        int ans = 0;
        for (int x : nums) {
            f = Math.max(f, 0) + x;
            g = Math.min(g, 0) + x;
            ans = Math.max(ans, Math.max(f, Math.abs(g)));
        }
        System.out.println(ans);
    }
}
