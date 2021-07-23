/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2021 All Rights Reserved.
 */
package no169_多数元素;

/**
 * @author mr.24
 * @version Id: Solution, v 1.0 2021/7/20 12:15 上午 Exp $$
 */
public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5, 3, 3};
        System.out.println(majorityElement(data));
        System.out.println(majorityElement(new int[]{2, 2, 3, 4, 2}));

    }

    /**
     * 找出多数元素(出现次数)
     *
     * @param nums 数组
     * @return 多数元素
     */
    public static int majorityElement(int[] nums) {
        int majorEle = nums[0];
        int times = 1;
        if (nums.length == 1 || nums.length == 2) {
            return majorEle;
        }
        for (int i = 1; i < nums.length; i++) {
            if (majorEle == nums[i]) {
                times++;
            } else {
                times--;
                if (times == 0) {
                    majorEle = nums[i + 1];
                }
            }
        }

        return majorEle;
    }
}
