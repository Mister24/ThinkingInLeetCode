package leetcode.no2390_从字符串中移除星号;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class Solution {
    
    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
    }
    
    /**
     *
     * @param s
     * @return
     */
    public static String removeStars(String s) {
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                stack.pop();
            } else {
                stack.add(s.charAt(i));
            }
        }
        int size = stack.size();
        String res = "";
        Stack stack1 = new Stack();
        for (int i = 0; i < size; i++) {
            stack1.add(stack.pop());
        }
        
        
        for (int i = 0; i < size; i++) {
            res += stack1.pop();
        }
        
        return res;
    }
}