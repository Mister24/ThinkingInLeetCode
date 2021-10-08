/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2021 All Rights Reserved.
 */
package no024_两两交换链表中的节点;

/**
 * @author mr.24
 * @version Id: Solution, v 1.0 2021/10/8 10:40 下午 Exp $$
 */
public class Solution {
    public static void main(String[] args) {
    }


    public ListNode swapPairs(ListNode head) {
        ListNode start = new ListNode(-1);
        start.next = head;
        ListNode pre = start;
        while (pre.next != null && pre.next.next != null) {
            ListNode temp = head.next.next;
            pre.next = head.next;
            head.next.next = head;
            head.next = temp;
            pre = head;
            head = head.next;
        }

        return start.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
