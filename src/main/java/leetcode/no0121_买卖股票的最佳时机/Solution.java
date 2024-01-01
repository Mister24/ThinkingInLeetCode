package leetcode.no0121_买卖股票的最佳时机;

class Solution {
    // 暴力解法，超时了
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[j] - prices[i] > max) {
                    max = prices[j] - prices[i];
                }
            }
        }
        
        return max;
    }
    
    /**
     *
     * @param prices
     * @return
     */
    public int maxProfit1(int[] prices) {
        int min = prices[0];
        int max = 0;
    
        for (int i = 1; i < prices.length; i++) {
            // 如果当前结点的预期收入大于之前的max，则替换之
            if (prices[i] - min > max) {
                max = prices[i] - min;
            }
            
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        
        return max;
    }
}