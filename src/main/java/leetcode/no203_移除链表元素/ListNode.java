package leetcode.no203_移除链表元素;

class ListNode {
    
    int val;
    
    ListNode next;
    
    ListNode(int x) {
        val = x;
        next = null;
    }
    
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}