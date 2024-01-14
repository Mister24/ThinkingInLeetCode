package leetcode.no1493_删掉一个元素以后全为1的最长子数组;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

class Solution {
    
    public static void main(String[] args) {
        int[] ints = new int[] {1, 1, 0, 0, 1, 0, 1, 0, 0, 1};
        //        int[] ints = new int[] {0, 1, 1, 1, 0, 1, 1, 0, 1};
        //        int[] ints = new int[] { 1, 1, 1};
        //        int[] ints = new int[] { 0, 0, 0};
        //        int[] ints = new int[] {0, 0, 1, 1};
        
        System.out.println(longestSubarray(ints));
    }
    
    /**
     * git commit -m "feature(leetcode 1493. 删掉一个元素以后全为 1 的最长子数组 medium): https://leetcode.cn/problems/longest-subarray-of-1s-after-deleting-one-element/description/?envType=study-plan-v2&envId=leetcode-75"
     * @param nums
     * @return
     */
    public static int longestSubarray(int[] nums) {
        int sum = 0, left = 0, right;
        for (right = 0; right < nums.length; right++) {
            sum += nums[right];
            // 说明遇到了nums[right]=0,left移动
            if (sum < right - left) {
                sum -= nums[left];
                left++;
            }
        }
        
        return right - left - 1;
    }
    
}