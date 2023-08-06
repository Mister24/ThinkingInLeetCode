package leetcode.no1768_交替合并字符串;

class Solution {
    
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1,word2));
    }
    
    public static String mergeAlternately(String word1, String word2) {
        if (word1 == null) {
            return word2;
        }
        
        if (word2 == null) {
            return word1;
        }
        
        String str = "";
        for (int i = 0; i < word1.length() || i < word2.length(); i++) {
            if (word1.length() > i) {
                str = str + String.valueOf(word1.charAt(i));
            }
            if (word2.length() > i) {
                str += String.valueOf(word2.charAt(i));
            }
        }
        
        return str;
    }
}