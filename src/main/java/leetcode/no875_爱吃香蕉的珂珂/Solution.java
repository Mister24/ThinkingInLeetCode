package leetcode.no875_爱吃香蕉的珂珂;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{1, 2, 3}, 8));
        System.out.println(minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
        System.out.println(minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        // 排序
        Arrays.sort(piles);

        // 速度最小
        int speedMin = 1;
        // 速度最大
        int speedMax = Math.max(1, piles[piles.length - 1]);

        while (speedMin < speedMax) {
            int mid = speedMin + (speedMax - speedMin) / 2;

            if (timeSum(piles, mid) > h) {
                speedMin = mid + 1;
            } else {
                speedMax = mid;
            }
        }
        // 返回最小速度
        return speedMin;
    }

    /**
     * 计算当前速度耗时
     *
     * @param piles
     * @param speed
     * @return
     */
    public static int timeSum(int[] piles, int speed) {
        int sum = 0;
        for (int i = 0; i < piles.length; i++) {
            sum += piles[i] % speed == 0 ? piles[i] / speed : piles[i] / speed + 1;
        }

        return sum;
    }
}
