package leetcode.no053_最大子数组和;

class Solution {
    
    public static void main(String[] args) {
        int[] nums = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
    
    public int maxSubArray1(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
    
    public static int maxSubArray(int[] nums) {
        int len = nums.length;
        if (0 == len) {
            return 0;
        }
        
        int[] dp = new int[len];
        dp[0] = nums[0];
        
        // f(i)=max{f(i−1)+nums[i],nums[i]}
        for (int i = 0; i < len - 1; i++) {
            // 判断条件
            // if (dp[i] > 0) {
            //if (dp[i-1] + nums[i] > dp[i]) {
            // 前面的值<0，则放弃
            if (dp[i] > 0) {
                dp[i + 1] = dp[i] + nums[i + 1];
            } else {
                dp[i + 1] = nums[i + 1];
            }
        }
        
        // 返回最大dp
        int max = nums[0];
        for (int i = 0; i < len; i++) {
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        
        return max;
    }
}