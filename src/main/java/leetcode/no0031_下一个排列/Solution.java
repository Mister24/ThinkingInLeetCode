package leetcode.no0031_下一个排列;

import java.util.Arrays;

class Solution {
    
    public static void main(String[] args) {
        int[] ints = new int[] {1, 2, 3};
        ints = new int[] {3, 2, 1};
        nextPermutation(ints);
        Arrays.stream(ints).forEach(i -> System.out.println(i));
    }
    
    //    先找出最大的索引 k 满足 nums[k] < nums[k+1]，如果不存在，就翻转整个数组；
    //    再找出另一个最大索引 l 满足 nums[l] > nums[k]；
    //    交换 nums[l] 和 nums[k]；
    //    最后翻转 nums[k+1:]。
    //
    public static void nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        if (i >= 0) {
            int j = len - 1;
            while (j >= 0 && nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        
        // 此时 i<0 ？？？
        // 如果不存在，i=0，此时需要翻转数组
        reOrder(nums, i + 1);
    }
    
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    static void reOrder(int[] nums, int index) {
        int left = index;
        int right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}