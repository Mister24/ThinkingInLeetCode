/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2021 All Rights Reserved.
 */
package no019_删除链表的倒数第N个结点;

import java.util.Deque;
import java.util.Stack;

/**
 * @author mr.24
 * @version Id: Solution, v 1.0 2021/9/21 9:10 上午 Exp $$
 */
public class Solution {


    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode startNode = new ListNode(0,head);
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = startNode;
        while (null != cur) {
            stack.push(cur);
            cur = cur.next;
        }

        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        // 被删除节点的前一个结点
        ListNode endNode = stack.peek();
        // 指针跳过被删除的结点
        endNode.next = endNode.next.next;

        // 返回原来的头结点
        return startNode.next;
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
