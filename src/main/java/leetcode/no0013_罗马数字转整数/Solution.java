package leetcode.no0013_罗马数字转整数;

import java.util.HashMap;
import java.util.Map;

class Solution {
    
    public int romanToInt(String s) {
        //        I             1
        //        V             5
        //        X             10
        //        L             50
        //        C             100
        //        D             500
        //        M             1000
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() -1 && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                res -= romanMap.get(s.charAt(i));
            } else {
                res += romanMap.get(s.charAt(i));
            }
        }
        return res;
    }
}