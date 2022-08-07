package leetcode.no062_不同路径;

class Solution {
    
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }
    
    public static int uniquePaths(int m, int n) {
        // 特殊场景
        if (m == 0 || n == 0) {
            return 1;
        }
        
        // 定义状态方程
        int dp[][] = new int[m + 1][n + 1];
        
        // 初始化第一行第一列
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }
        
        for (int i = 0; i <= n; i++) {
            dp[0][i] = 1;
        }
        
        // dp可以为倒推
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
        
        return dp[m - 1][n - 1];
    }
}