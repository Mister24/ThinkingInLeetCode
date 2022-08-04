package leetcode.no027_移除元素;

class Solution {
    
    public static void main(String[] args) {
        int[] ints = new int[] {1, 2, 3, 4, 5, 6, 7, 7, 8, 0};
        System.out.println(removeElement(ints, 7));
    
        int[] ints1 = new int[] {3, 2, 2, 3};
        System.out.println(removeElement(ints1, 3));
    }
    
    public static int removeElement(int[] nums, int val) {
        int j = nums.length - 1;
        for (int i = 0; i <= j; i++) {
            if (nums[i] == val) {
                // i-- 神之一手
                swap(nums, i--, j--);
            }
        }
        
        return j + 1;
    }
    
    public static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}