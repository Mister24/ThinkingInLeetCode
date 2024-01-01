package leetcode.no0142_环形链表II;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slowPointer = new ListNode(0);
        slowPointer.next = head;
    
        ListNode fastPointer = new ListNode(0);
        fastPointer.next = head;
        
        while (null != slowPointer.next && null != fastPointer.next.next) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            
            if (slowPointer == fastPointer) {
                return slowPointer;
            }
        }
        
        return null;
    }
    
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    
}