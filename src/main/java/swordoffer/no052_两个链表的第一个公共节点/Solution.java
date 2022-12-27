package swordoffer.no052_两个链表的第一个公共节点;

class Solution {
    
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dummyNode1 = new ListNode(-1);
        ListNode dummyNode2 = new ListNode(-1);
        dummyNode1 = headA;
        dummyNode2 = headB;
        int reverseA = 2;
        int reverseB = 2;
        
        while (reverseA != 0 && reverseB != 0) {
            if (dummyNode1 == dummyNode2) {
                return dummyNode2;
            }
            
            if (dummyNode1 != null && dummyNode2 != null) {
                dummyNode1 = dummyNode1.next;
                dummyNode2 = dummyNode2.next;
            } else if (dummyNode1 == null && dummyNode2 == null) {
                dummyNode1 = headB;
                dummyNode2 = headA;
                reverseA--;
                reverseB--;
            } else if (dummyNode1 == null) {
                dummyNode1 = headB;
                dummyNode2 = dummyNode2.next;
                reverseA--;
            } else if (dummyNode2 == null) {
                dummyNode2 = headA;
                dummyNode1 = dummyNode1.next;
                reverseB--;
            }
        }
        
        return null;
    }
}