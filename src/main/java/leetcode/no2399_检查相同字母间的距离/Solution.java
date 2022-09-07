package leetcode.no2399_检查相同字母间的距离;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

class Solution {
    
    public static void main(String[] args) {
        System.out.println(checkDistances("aa",
                new int[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        ;
    }
    
    public static boolean checkDistances(String s, int[] distance) {
        char[] chars = s.toCharArray();
        int[] ints = new int[26];
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    ints[chars[i] - 'a'] = j - i - 1;
                    break;
                }
            }
        }
        
        
        for (int i = 0; i < distance.length; i++) {
            // 1. 元素不存在
            // 2. 距离为0
            if ((ints[i] != distance[i] && ints[i] != 0) || (ints[i] != distance[i] && ints[i] == 0 && s.contains(
                    String.valueOf((char) ('a' + i))))) {
                
                return false;
            }
        }
        
        return true;
    }
}