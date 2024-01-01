package leetcode.no0268_丢失的数字;

import java.util.Arrays;

class Solution {
    
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        
        return nums.length;
    }
}