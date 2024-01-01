package leetcode.no2095_删除链表的中间节点;

import com.sun.jmx.snmp.SnmpNull;

import java.util.List;

class Solution {
    
    public static void main(String[] args) {
        ListNode listNode0 = new ListNode(1);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(1);
        listNode0.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;
        System.out.println(deleteMiddleV2(listNode0));
    }
    
    public static ListNode deleteMiddleV2(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode pre = head;
        // 计算长度
        int count = 1;
        while (pre != null && pre.next != null) {
            count++;
            pre = pre.next;
        }
        
        // 重置结点指针
        pre = head;
        int cur = 1;
        while (pre != null && pre.next != null ) {
            if (cur == count / 2) {
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
            cur ++;
        }
        
        return head;
    }
    
    public ListNode deleteMiddle(ListNode head) {
        if (null == head || head.next == null) {
            return null;
        }
    
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode pre = head;
        while (pre.next != slow) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        
        return head;
    }
    
}