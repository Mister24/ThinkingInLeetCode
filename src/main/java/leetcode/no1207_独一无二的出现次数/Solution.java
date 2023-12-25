package leetcode.no1207_独一无二的出现次数;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

class Solution {
    
    public static void main(String[] args) {
        int[] ints = new int[] {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(ints));
    }
    
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Boolean> map1 = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) != null) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        
        AtomicBoolean res = new AtomicBoolean(true);
        map.values().forEach(value -> {
            if (map1.get(value) != null && map1.get(value) == true) {
                res.set(false);
                return;
            } else {
                map1.put(value, true);
            }
        });
        
        return res.get();
        //        boolean res = true;
        //        for (Integer value : map.values()) {
        //            if (value >=2){
        //                res = false;
        //                break;
        //            }
        //        }
        //        return res;
    }
}