package leetcode.no775_全局倒置与局部倒置;

class Solution {
    
    public static void main(String[] args) {
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 0;
        System.out.println(isIdealPermutation(ints));
    }
    
    public static boolean isIdealPermutation(int[] nums) {
        if (null == nums) {
            return true;
        }
        
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            int data = nums[i];
            for (int j = i + 1; j < len; j++) {
                if (data > nums[j] && j-i>1) {
                    return false;
                }
            }
        }
        
        return true;
    }
}