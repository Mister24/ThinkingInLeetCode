/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2021 All Rights Reserved.
 */
package leetcode.no021_合并两个有序链表;

/**
 * @author mr.24
 * @version Id: Solution, v 1.0 2021/9/21 9:43 上午 Exp $$
 */
public class Solution {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode startNode1 = new ListNode(0, l1);
        ListNode startNode2 = new ListNode(0, l2);

        ListNode mergedNode = new ListNode();

        if (startNode1.next == null) {
            mergedNode.next = startNode2;
        }

        if (startNode2.next == null) {
            mergedNode.next = startNode1;
        }

        while (startNode1.next != null && startNode2.next != null) {
            if (startNode1.val <= startNode2.val) {
                mergedNode.next = startNode1;
                startNode1 = l1.next;
            } else {
                mergedNode.next = startNode2;
                startNode2 = l2.next;
            }
        }

        return mergedNode.next;
    }

     class ListNode {
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
