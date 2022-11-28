package leetcode.no035_搜索插入位置;

class Solution {
    
    public static void main(String[] args) {
        int[] nums = new int[] {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 2));
    }
    
    public static int searchInsert(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        
        return min;
    }
}