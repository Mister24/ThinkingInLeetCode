package leetcode.no125_验证回文串;

class Solution {
    
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    
    public static boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (
                    s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                stringBuilder.append(s.charAt(i));
            }
        }
        
        String removeSpaceString = stringBuilder.toString();
        
        if (removeSpaceString == null || removeSpaceString.length() == 0) {
            return true;
        }
        
        for (int i = 0; i <= removeSpaceString.length() / 2; i++) {
            if (toUpperCase(removeSpaceString.charAt(i)) != toUpperCase(
                    removeSpaceString.charAt(removeSpaceString.length() - 1 - i))) {
                return false;
            }
        }
        
        return true;
    }
    
    private static char toUpperCase(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char) (ch + 'A' - 'a');
        }
        
        return ch;
    }
}