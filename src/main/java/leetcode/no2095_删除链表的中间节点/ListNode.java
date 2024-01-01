package leetcode.no2095_删除链表的中间节点;

class ListNode {
    
    int val;
    
    ListNode next;
    
    public ListNode() {
    }
    
    ListNode(int x) {
        val = x;
        next = null;
    }
    
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}