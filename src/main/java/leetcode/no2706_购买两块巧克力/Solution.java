package leetcode.no2706_购买两块巧克力;

import java.util.Arrays;

class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if (prices[0] + prices[1] <= money) {
            money -= (prices[0]+prices[1]);
        }
        
        return money;
    }
}