package swordoffer.no006_从尾到头打印链表;

import java.util.Stack;

class Solution {
    
    public int[] reversePrint(ListNode head) {
        Stack stack = new Stack();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        
        int[] ints = new int[stack.size()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) stack.pop();
        }
        
        return ints;
    }
}