package leetcode.no0242_有效的字母异位词;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        if (s.length() == t.length() && s.length() == 0) {
            return true;
        }
    
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
    
        Arrays.sort(chars1);
        Arrays.sort(chars2);
    
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }
        
        return true;
    }
}