package leetcode.no1679_K和数对的最大数目;

import java.util.Arrays;

class Solution {
    
    public int maxOperations(int[] nums, int k) {
        if (nums.length <= 1) {
            return 0;
        }
        int pairCount = 0;
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int twoSum = nums[left] + nums[right];
            if (twoSum == k) {
                pairCount++;
                left++;
                right--;
            }
            if (twoSum<k) {
                left++;
            }
            if (twoSum>k) {
                right--;
            }
        }
        
        return pairCount;
    }
} 