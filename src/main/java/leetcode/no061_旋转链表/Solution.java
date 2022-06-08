/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2021 All Rights Reserved.
 */
package leetcode.no061_旋转链表;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author mr.24
 * @version Id: Solution, v 1.0 2021/10/17 11:00 上午 Exp $$
 */
public class Solution {
    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5);
        listNode5.next = null;
        ListNode listNode4 = new ListNode(4);
        listNode4.next = listNode5;
        ListNode listNode3 = new ListNode(3);
        listNode3.next = listNode4;
        ListNode listNode2 = new ListNode(2);
        listNode2.next = listNode3;
        ListNode listNode1 = new ListNode(1);
        listNode1.next = listNode2;

        sout(rotateRight(listNode1, 2));
    }


    public static ListNode rotateRight(ListNode head, int k) {
        ListNode end = null;
        ListNode start = null;
        Queue queue = new ArrayDeque();
        ListNode prePart = new ListNode();
        prePart.next = head;
        ListNode postPart = new ListNode();

        // 计算长度
        int len = getLen(head);

        int prePartLen = len - k;
        while (prePart != null) {
            for (int i = 0; i < prePartLen; i++) {
                prePart = prePart.next;
            }

            prePart.next = null;
        }

        while (head.next != null) {
            int temp = 0;
            while (temp <= len - k) {
                head = head.next;
                temp++;
            }

            // 后半部分
            end.next = head.next;
            // 前半部分
            head.next = null;
        }

        while (end.next != null) {
            queue.add(end.val);
            end = end.next;
        }

        while (queue.size() > 0) {
            ListNode newNode = new ListNode();
            newNode.val = (Integer) queue.peek();
            queue.remove();
            newNode.next = start.next;
        }

        return start.next;
    }

    public static int getLen(ListNode head) {
        int len = 0;
        ListNode lenNode = new ListNode();
        lenNode.next = head;
        while (lenNode.next != null) {
            len++;
            lenNode = lenNode.next;
        }
        // 去除一个多余的计算
        len--;
        return len;
    }


    public static class ListNode {
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

    public static void sout(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

}
