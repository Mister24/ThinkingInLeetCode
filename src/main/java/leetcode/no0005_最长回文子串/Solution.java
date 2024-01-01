package leetcode.no0005_最长回文子串;

class Solution {
    
    public static void main(String[] args) {
        longestPalindrome("abababacc");
    }
    
    public static String longestPalindrome(String s) {
        int len = s.length();
        // 长度0/1/2为符合条件
        if (len < 2) {
            return s;
        }
        
        // dp[i][j] 表示：子串 s[i..j] 是否为回文子串
        // 这里子串 s[i..j] 定义为左闭右闭区间，即可以取到 s[i] 和 s[j]。
        // dp[i][j] = (s[i] == s[j]) and dp[i + 1][j - 1]
        boolean[][] dp = new boolean[len][len];
        char[] chars = s.toCharArray();
        
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        
        int max = 1;
        int begin = 0;
        
        for (int j = 0; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if (chars[i] != chars[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && j - i + 1 > max) {
                    max = j - i + 1;
                    begin = i;
                }
            }
        }
        
        return s.substring(begin, begin + max);
    }
}