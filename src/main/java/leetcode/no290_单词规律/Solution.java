package leetcode.no290_单词规律;

import java.util.HashMap;
import java.util.Map;

class Solution {
    
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }
    
    public static boolean wordPattern(String pattern, String s) {
        if (s.length() == 0) {
            return false;
        }
        
        String[] strings = s.split(" ");
        if (strings.length != pattern.length()) {
            return false;
        }
    
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.keySet().contains(pattern.charAt(i))) {
                if (map.get(pattern.charAt(i)).equals(strings[i])) {
                    continue;
                } else {
                    return false;
                }
            } else {
                // 判断keyvalue映射必须是一对一
                if (map.values().contains(strings[i])) {
                    return false;
                }
                map.put(pattern.charAt(i), strings[i]);
            }
        }
        
        return true;
    }
}