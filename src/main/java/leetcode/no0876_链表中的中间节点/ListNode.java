package leetcode.no0876_链表中的中间节点;

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