package leetcode.no0680_验证回文串II;

import sun.tools.jconsole.JConsole;

class Solution {
    
    public static void main(String[] args) {
        System.out.println(validPalindrome("eedede"));
    }
    
    public static boolean validPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        
        int maxRemoved = 1;
        for (int i = 0; i < s.length() / 2; i++) {
            char pre = s.charAt(i);
            char pos = s.charAt(s.length() - i - 1);
            if (pre != pos && maxRemoved == 0) {
                return false;
            }
            
            if (pre != pos && maxRemoved == 1) {
                maxRemoved--;
                if (pre != s.charAt(s.length() - i - 2) || pos != s.charAt(i + 1)) {
                    return false;
                } else {
//                    if ()
                }
            }
            
            if (pre == pos) {
                continue;
            }
        }
        
        return true;
    }
}