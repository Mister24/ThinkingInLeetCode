package leetcode.no0345_反转字符串中的元音字母;

class Solution {
    
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
    
    public static String reverseVowels(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s;
        }
        
        int len = s.length();
        char[] chars = s.toCharArray();
        int pre = 0;
        int pos = len - 1;
        while (pre < pos) {
            if (isTarget(chars[pre]) && isTarget(chars[pos])) {
                swap(chars, pre, pos);
                pre++;
                pos--;
            }
            
            if (!isTarget(chars[pre])) {
                pre++;
            }
            
            if (!isTarget(chars[pos])) {
                pos--;
            }
        }
        
        return String.valueOf(chars);
    }
    
    static boolean isTarget(char ch) {
        
        return "aeiouAEIOU".indexOf(String.valueOf(ch)) >=0;
    }
    
    static void swap(char[] chars, int pre, int pos) {
        char tmp = chars[pre];
        chars[pre] = chars[pos];
        chars[pos] = tmp;
    }
}