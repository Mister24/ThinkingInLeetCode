package leetcode.no049_字母异位词分组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    
    public static void main(String[] args) {
        String[] strings = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strings));
    }
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return null;
        }
        List<List<String>> lists;
        Map<String, List<String>> map = new HashMap<>();
        
        for (int i = 0; i < strs.length; i++) {
            if (null == map.get(sort(strs[i]))) {
                map.put(sort(strs[i]), new ArrayList<>());
                map.get(sort(strs[i])).add(strs[i]);
            } else {
                map.get(sort(strs[i])).add(strs[i]);
            }
            
        }
        
        lists = map.values().stream().collect(Collectors.toList());
        
        return lists;
    }
    
    public static String sort(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        
        Arrays.sort(chars);
        
        return String.valueOf(chars);
    }
}