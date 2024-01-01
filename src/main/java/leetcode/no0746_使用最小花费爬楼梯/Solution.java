package leetcode.no0746_使用最小花费爬楼梯;

import java.util.Arrays;

class Solution {
    
    public static void main(String[] args) {
        //System.out.println(minCostClimbingStairs(new int[]{10,15,20}));
        System.out.println(minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }
    
    
    public  static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        
        // dp[] 到达当前结点，总的花费
        // min = min{dp[n-2] + cost[n-2], dp[n-1] + cost[n-1]};
        for (int i = 2; i < n + 1; i++) {
            dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        }
        
        return dp[n];
    }
}