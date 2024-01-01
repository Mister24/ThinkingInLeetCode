package leetcode.no0009_回文数;

class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        
        if (str.length() == 1) {
            return true;
        }
        
        char[] chars = str.toCharArray();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (chars[i] != chars[len - 1 - i]) {
                return false;
            }
        }
        
        return true;
    }
}