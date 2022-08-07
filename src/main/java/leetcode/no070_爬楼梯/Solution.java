package leetcode.no070_爬楼梯;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

class Solution {
    
    public static void main(String[] args) {
        System.out.println(climbStairs(1));
        System.out.println(climbStairs(44));
        System.out.println(Integer.MAX_VALUE);
    }
    
    public static int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
    }
}