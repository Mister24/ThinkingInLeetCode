package leetcode.no0083_删除排序链表中的重复元素;

class Solution {
    
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode pos = head;
        while (null != pos && null != pos.next) {
            if (pos.val == pos.next.val) {
                pos.next = pos.next.next;
            } else {
                pos = pos.next;
            }
        }
        
        return head;
    }
}