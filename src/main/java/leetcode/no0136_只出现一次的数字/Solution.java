package leetcode.no0136_只出现一次的数字;

class Solution {
    
    public static void main(String[] args) {
    }
    
    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }

        return res;
    }
}