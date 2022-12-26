package leetcode.no876_链表中的中间节点;

class Solution {
    
    public ListNode middleNode(ListNode head) {
        ListNode slow = new ListNode(0);
        ListNode fast = new ListNode(0);
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        slow = dummyNode;
        fast = dummyNode;
        while (slow != null && slow.next != null && fast != null) {
            slow = slow.next;
            if (fast.next == null) {
                return slow;
            }else {
                fast = fast.next;
                if (fast.next == null) {
                    return slow.next;
                } else {
                    fast = fast.next;
                }
            }
//            if (fast.next.next != null) {
//                fast = fast.next.next;
//            } else {
//                return slow.next;
//            }
            
        }
        
        return slow;
    }
}