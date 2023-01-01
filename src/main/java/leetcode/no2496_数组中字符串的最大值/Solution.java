package leetcode.no2496_数组中字符串的最大值;

class Solution {
    public static int maximumValue(String[] strs) {
        if (strs.length == 0) {
            return 0;
        }
        
        int[] ints = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            ints[i] = getLen(strs[i]);
        }
    
        int max = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]>max) {
                max=ints[i];
            }
        }
        
        return max;
    }
    
    public static int getLen(String str) {
        if (str.length() ==0) {
            return 0;
        }
        
        if (isAllZero(str)) {
            return 0;
        }
        
        if (isDigit(str)) {
            return Integer.parseInt(str);
        }
        
        return str.length();
    }
    
    public static boolean isDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        
        return true;
    }
    
    public static boolean isAllZero(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                continue;
            }
            
            return false;
        }
        
        return true;
    }
}