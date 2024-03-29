package leetcode.no0392_判断子序列;

class Solution {
    
    public static void main(String[] args) {
    
    }
    
    public static boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j = j + 1;
                if (i == s.length()) {
                    return true;
                }
            } else {
                j++;
            }
        }
        
        return false;
    }
}