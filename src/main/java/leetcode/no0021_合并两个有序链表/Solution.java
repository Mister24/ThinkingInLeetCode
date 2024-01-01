/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2021 All Rights Reserved.
 */
package leetcode.no0021_合并两个有序链表;

/**
 * @author mr.24
 * @version Id: Solution, v 1.0 2021/9/21 9:43 上午 Exp $$
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pre = new ListNode(-1);
        ListNode cur = pre;
        while (list1 != null && list2 != null) {
            if (list1.val<= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        
        if (list1 == null) {
            cur.next = list2;
        } else {
            cur.next = list1;
        }
        
        return pre.next;
    }

     class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
