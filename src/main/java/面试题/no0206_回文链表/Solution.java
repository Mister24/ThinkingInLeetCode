package 面试题.no0206_回文链表;

import java.util.ArrayList;
import java.util.List;

class Solution {
    
    public static void main(String[] args) {
        ListNode listNode = new ListNode(-129);
        listNode.next = new ListNode(-129);
        System.out.println(isPalindrome(listNode));
    }
    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
    
        if (list.size() > 0){
            for (int i = 0; i <= list.size()/2; i++) {
                if (!list.get(i).equals(list.get(list.size() - i - 1))) {
                    return false;
                }
            }
        }
        return true;
    }
}