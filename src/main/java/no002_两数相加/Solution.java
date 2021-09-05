/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2021 All Rights Reserved.
 */
package no002_两数相加;

/**
 * @author mr.24
 * @version Id: Solution, v 1.0 2021/9/2 12:09 上午 Exp $$
 */
public class Solution {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        }

        if (null == l2) {
            return l1;
        }

        int l1_len = 0;
        while (null != l1) {
            l1 = l1.next;
            l1_len++;
        }

        int l2_len = 0;
        while (null != l2) {
            l2 = l2.next;
            l2_len++;
        }

        // list -> 数组
        int[] l1_array = new int[l1_len];
        for (int i = 0; i < l1_len; i++) {
            l1_array[i] = l1.val;
            l1 = l1.next;
        }

        int[] l2_array = new int[l1_len];
        for (int i = 0; i < l2_len; i++) {
            l2_array[i] = l1.val;
            l2 = l2.next;
        }

        // 数组相加
        int[] result = new int[l1_len > l2_len ? l1_len + 1 : l2_len + 1];
        for (int i = 0;i<result.length;i++) {
            if (i > l1_len) {

            }
        }
        // 数组 -> list
        return null;
    }
}
