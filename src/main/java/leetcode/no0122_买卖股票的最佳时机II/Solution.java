package leetcode.no0122_买卖股票的最佳时机II;

class Solution {
    
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0) {
                sum += prices[i] - prices[i - 1];
            }
        }
        
        return sum;
    }
    
    /**
     * 动态规划解法
     *
     * @param prices
     * @return
     */
    public int maxProfit_dp(int[] prices) {
        int length = prices.length;
        int[][] dp = new int[length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        // 注意i的起始值
        for (int i = 1; i < length; i++) {
            // 每一天的状态只与前一天的状态有关，而与更早的状态都无关，因此我们不必存储这些无关的状态
            // 只需要将 dp[i−1][0] 和 dp[i−1][1] 存放在两个变量中，
            // 通过它们计算出 dp[i][0] 和 dp[i][1] 并存回对应的变量，以便于第 i+1 天的状态转移即可
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][0] - prices[i], dp[i - 1][1]);
        }
        
        return dp[length - 1][0];
    }
}