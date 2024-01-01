package leetcode.no0067_二进制求和;

import java.util.Stack;

class Solution {
    
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));;
    }
    
    public static String addBinary(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        
        Stack stack1 = new Stack<>();
        Stack stack2 = new Stack<>();
        Stack stack3 = new Stack<>();
        
        for (int i = 0; i < len1; i++) {
            stack1.push(a.charAt(i));
        }
        
        for (int i = 0; i < len2; i++) {
            stack2.push(b.charAt(i));
        }
        
        int min = Math.min(len1, len2);
        int index = 0;
        int tag = 0;
        while (index < min) {
            index++;
            char tmp1 = (char)stack1.pop();
            char tmp2 = (char)stack2.pop();
            
            stack3.push(String.valueOf(
                    (Integer.valueOf(String.valueOf(tmp1)) + Integer.valueOf(String.valueOf(tmp2))) % 2)
                    + tag);
            tag = (Integer.valueOf(String.valueOf(tmp1)) + Integer.valueOf(String.valueOf(tmp2))) / 2;
        }
        
        if (min == len1) {
            while (index < len2) {
                index++;
                stack3.push(String.valueOf(stack2.pop()));
            }
        } else {
            while (index < len1) {
                index++;
                stack3.push(String.valueOf(Integer.valueOf(String.valueOf(stack1.pop())))
                        + tag);
                stack3.push(String.valueOf(stack1.pop()));
            }
        }
        
        String res = "";
        for (int i = 0; i < stack3.size(); i++) {
            res += String.valueOf(stack3.pop());
        }
        
        return res;
    }
}