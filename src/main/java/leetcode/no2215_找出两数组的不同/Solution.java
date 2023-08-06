package leetcode.no2215_找出两数组的不同;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    
    public static void main(String[] args) {
    
    }
    
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
    
        List<Integer> list1 = new ArrayList();
        List<Integer> list1_return = new ArrayList();
        List<Integer> list2 = new ArrayList();
        List<Integer> list2_return = new ArrayList();
    
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        Arrays.stream(nums1).forEach(
                i -> map1.put(i,i)
        );
        Arrays.stream(nums2).forEach(
                i -> map2.put(i,i)
        );
        
        map1.entrySet().forEach(
                entry -> {
                    if (null == map2.get(entry.getKey())){
                        list1_return.add(entry.getKey());
                    }
                }
        );
    
        map2.entrySet().forEach(
                entry -> {
                    if (null == map1.get(entry.getKey())){
                        list2_return.add(entry.getKey());
                    }
                }
        );
    
        list.add(list1_return);
        list.add(list2_return);
        
        return list;
    }
}