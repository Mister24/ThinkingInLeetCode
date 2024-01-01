/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2021 All Rights Reserved.
 */
package leetcode.no0011_盛最多的水;

/**
 * @author mr.24
 * @version Id: Solution, v 1.0 2021/9/11 4:41 下午 Exp $$
 */
public class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0;
        while (left < right) {
            max = height[left] < height[right] ?
                    Math.max(max, (right - left) * height[left++]) :
                    Math.max(max, (right - left) * height[right--]);
        }

        return max;
    }
}
