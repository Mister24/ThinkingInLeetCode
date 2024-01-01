package leetcode.no0034_在排序数组中查找元素的第一个和最后一个位置;

class Solution {
    
    public int[] searchRange(int[] nums, int target) {
        int left = search(nums, target);
        int right = search(nums, target + 1);
        return left == right ? new int[] {-1, -1} : new int[] {left, right - 1};
    }
    
    int search(int[] nums, int x) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (nums[mid] >= x) {
                left = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
    
}