import java.util.Arrays;
public class MissingNumber {
    public static void main(String[] args) {
        int[] num={1,3,7,4,6,8,9,2};
        int res=missingNumber(num);
        System.out.println(res);
    }

        static int missingNumber(int[] nums) {

            Arrays.sort(nums);

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] != i+1)
                    return i+1;
            }

            return nums.length;
        }
    }


//import java.util.HashSet;
//
//class Solution {
//
//    public int missingNumber(int[] nums) {
//
//        HashSet<Integer> set = new HashSet<>();
//
//        for (int num : nums)
//            set.add(num);
//
//        for (int i = 0; i <= nums.length; i++) {
//
//            if (!set.contains(i))
//                return i;
//        }
//
//        return -1;
//    }
//}
//class Solution {
//
//    public int missingNumber(int[] nums) {
//
//        int n = nums.length;
//
//        int expectedSum = n * (n + 1) / 2;
//
//        int actualSum = 0;
//
//        for (int num : nums)
//            actualSum += num;
//
//        return expectedSum - actualSum;
//    }
//}
//class Solution {
//
//    public int missingNumber(int[] nums) {
//
//        int xor = nums.length;
//
//        for (int i = 0; i < nums.length; i++) {
//            xor ^= i;
//            xor ^= nums[i];
//        }
//
//        return xor;
//    }
//}

//class Solution {
//    public int missingNumber(int[] nums) {
//
//        int n = nums.length;
//
//        for (int i = 0; i <= n; i++) {
//
//            boolean found = false;
//
//            for (int j = 0; j < n; j++) {
//
//                if (nums[j] == i) {
//                    found = true;
//                    break;
//                }
//            }
//
//            if (!found)
//                return i;
//        }
//
//        return -1;
//    }
//}