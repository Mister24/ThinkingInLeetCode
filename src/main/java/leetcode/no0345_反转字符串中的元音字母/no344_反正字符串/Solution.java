package leetcode.no0345_反转字符串中的元音字母.no344_反正字符串;

class Solution {
    
    public void reverseString(char[] s) {
        if (s.length == 0 || s.length == 1) {
            return;
        }
        
        for (int i = 0; i < s.length / 2; i++) {
            char tmp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = tmp;
        }
    }
}