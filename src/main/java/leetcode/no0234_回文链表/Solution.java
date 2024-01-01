package leetcode.no0234_回文链表;

class Solution {
    
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        
        if (head != null && head.next == null) {
            return true;
        }
        
        ListNode pre = null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            ListNode tmp = slow.next;
            if (pre != null) {
                slow.next = pre;
            }
            pre = slow;
            fast = fast.next.next;
            slow = tmp;
        }
        if (fast != null) {
            slow = slow.next;
        }
        while (slow != null) {
            if (slow.val != pre.val) {
                return false;
            }
            slow = slow.next;
            pre = pre.next;
        }
        
        return true;
    }
}