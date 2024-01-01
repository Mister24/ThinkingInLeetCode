package swordoffer.no022_链表中倒数第k个节点;

class Solution {
    
    public ListNode getKthFromEnd(ListNode head, int k) {
        int len = 0;
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode cur = new ListNode(0);
        cur = dummyNode;
        while (cur.next != null) {
            len++;
            cur = cur.next;
        }
        
        int target = len-k;
        while (head != null) {
            head = head.next;
            len--;
            if (len == target) {
                return head;
            }
        }
        
        return null;
    }
}