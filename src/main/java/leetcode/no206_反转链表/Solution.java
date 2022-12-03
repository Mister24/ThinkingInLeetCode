package leetcode.no206_反转链表;

import java.util.List;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }
    
        ListNode pre = null;
        ListNode cur = head;
        
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        
        return pre;
    }
}