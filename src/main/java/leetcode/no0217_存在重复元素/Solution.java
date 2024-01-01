package leetcode.no0217_存在重复元素;

import java.util.HashMap;
import java.util.Map;

class Solution {
    
    public boolean containsDuplicate(int[] nums) {
        if (null == nums) {
            return false;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                return true;
            } else {
                map.put(nums[i], 1);
            }
        }
        
        return false;
    }
}