package leetcode.no014_最长公共前缀;

class Solution {
    
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        
        String commonPrefix = strs[0].toString();
        for (int i = 0; i < strs.length; i++) {
            commonPrefix = longestCommonPrefixOfTwoString(commonPrefix, strs[i]);
            if (commonPrefix.length() == 0) {
                return commonPrefix;
            }
        }
        
        return commonPrefix;
    }
    
    private String longestCommonPrefixOfTwoString(String str1, String str2) {
        int len = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < len && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        
        return str1.substring(0, index);
    }
}