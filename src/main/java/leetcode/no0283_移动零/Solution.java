package leetcode.no0283_移动零;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0] = 0;
        num[1] = 1;
        num[2] = 0;
        num[3] = 3;
        num[4] = 12;
    
        moveZeroes(num);
    
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
    }
    
    public static void moveZeroes(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
        }
        
        int[] res = new int[nums.length];
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                queue.offer(nums[i]);
            }
        }
    
        final int queueLen = queue.size();
        System.out.println(queueLen + "===");
        for (int i = 0; i < nums.length; i++) {
            if (i < queueLen) {
                nums[i] = queue.poll();
                continue;
            }
    
            nums[i] = 0;
        }
    }
}