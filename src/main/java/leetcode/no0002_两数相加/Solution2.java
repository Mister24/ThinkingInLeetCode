package leetcode.no0002_两数相加;

public class Solution2 {
    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int flag = 0;
        int sum;
        while (null != l1 || null != l2 || flag != 0) {
            int num1 = getNum(l1);
            int num2 = getNum(l2);
            sum = (num1 + num2 + flag) % 10;
            flag = (num1 + num2 + flag) / 10;

            ListNode sumNode = new ListNode(sum);
            cursor.next = sumNode;
            cursor = sumNode;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return root.next;
    }

    private static int getNum(ListNode listNode) {
        if (listNode == null) {
            return 0;
        } else {
            return listNode.val;
        }
    }
}
