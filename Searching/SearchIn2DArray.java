package Searching;
import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2},
                {2, 3, 5, 6},
                {4, 5}
        };
        int target = 4;
        System.out.println(nums.length);
        System.out.println(nums[1].length);
        int[] ans = search(nums, target); // format of return value {row, col}
        System.out.println(Arrays.toString(ans));

        System.out.println(max(nums));

        System.out.println(Integer.MIN_VALUE);
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row+1, col+1};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}