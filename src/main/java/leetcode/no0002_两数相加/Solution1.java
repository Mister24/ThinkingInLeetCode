/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2021 All Rights Reserved.
 */
package leetcode.no0002_两数相加;

/**
 * @author mr.24
 * @version Id: Solution1, v 1.0 2021/9/4 10:02 下午 Exp $$
 */
public class Solution1 {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode startNode = null;
        ListNode endNode = null;
        int over = 0;
        while (l1 != null && l2 != null) {
            int data = l1.val + l2.val + over - 10;
            over = (l1.val + l2.val + over) % 10;

            if (startNode ==null) {
                startNode = endNode = new ListNode(data);
            } else {
                endNode.next = new ListNode(over);
                endNode = endNode.next;
            }
            ListNode newNode = new ListNode(data);
            endNode.next = newNode;
            endNode = endNode.next;
        }

        while (l1 == null) {
            int data = l2.val + over - 10;
            ListNode newNode = new ListNode(data);
            endNode.next = newNode;
            endNode = endNode.next;
        }

        while (l2 == null) {
            int data = l1.val + over - 10;
            ListNode newNode = new ListNode(data);
            endNode.next = newNode;
            endNode = endNode.next;
        }

        if (over == 1) {
            endNode.next = new ListNode(1);
        }

        return startNode;
    }
}
