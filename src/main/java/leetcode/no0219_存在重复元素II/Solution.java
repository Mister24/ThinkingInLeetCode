package leetcode.no0219_存在重复元素II;

import java.util.HashMap;
import java.util.Map;

class Solution {
    
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null) {
            return false;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null && Math.abs(map.get(nums[i]) - i) <= k) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        
        return false;
    }
}