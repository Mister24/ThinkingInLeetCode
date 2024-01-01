package leetcode.no33_搜索旋转排序数组;

class Solution {
    
    public int search(int[] nums, int target) {
        if (0 == nums.length) {
            return -1;
        }
        
        if (1 == nums.length) {
            return nums[0] == target ? 0 : -1;
        }
        
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[nums.length - 1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            
            //            if (target >= left && target < mid || target > mid && target <= right) {
            //                right = mid;
            //            }
        }
        
        return -1;
    }
}