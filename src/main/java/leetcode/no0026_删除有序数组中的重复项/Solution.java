/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2021 All Rights Reserved.
 */
package leetcode.no0026_删除有序数组中的重复项;

/**
 * @author mr.24
 * @version Id: Solution, v 1.0 2021/9/20 11:10 下午 Exp $$
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println();
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int slow = 1, fast = 1;
        int len = nums.length;

        while (fast < len) {
            if (nums[fast] != nums[fast - 1]) {
                // slow跳到新的唯一值的位置
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }


        return slow;
    }
}