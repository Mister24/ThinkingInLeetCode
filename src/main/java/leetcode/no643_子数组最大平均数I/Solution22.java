package leetcode.no643_子数组最大平均数I;

public class Solution22 {
    
    public static void main(String[] args) {
        int[] nums = new int[1];
        nums[0] = 1;
        System.out.println(findMaxAverage(nums, 1));
    }
    
    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int max = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            max = Math.max(max, sum);
        }
        
        return 1.0 * max / k;
    }
}
