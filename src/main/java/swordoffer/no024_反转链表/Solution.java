package swordoffer.no024_反转链表;

import java.util.List;

class Solution {
    
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode pre = null;
        ListNode cur = head;
        
        while (cur != null) {
            // 提前记录下一个待处理的节点
            ListNode next = cur.next;
            // 当前节点指向pre，实现当前节点的反转
            cur.next = pre;
            // pre后移
            pre=cur;
            // cur后移
            cur=next;
        }
        
        return pre;
    }
}