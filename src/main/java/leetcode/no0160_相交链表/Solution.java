package leetcode.no0160_相交链表;

import java.util.List;

public class Solution {
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
    
        ListNode pointOfA = headA;
        ListNode pointOfB = headB;
        
        while (pointOfA != pointOfB) {
            if (pointOfA != null) {
                pointOfA = pointOfA.next;
            } else {
                pointOfA = headB;
            }
    
            if (pointOfB != null) {
                pointOfB = pointOfB.next;
            } else {
                pointOfB = headA;
            }
        }
        
        return pointOfA;
    }
}