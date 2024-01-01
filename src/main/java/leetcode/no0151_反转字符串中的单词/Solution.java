package leetcode.no0151_反转字符串中的单词;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class Solution {
    
    public static void main(String[] args) {
//        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
    }
    
    public static String reverseWords(String s) {
        String[] strings = s.split("");
        Stack stack = new Stack();
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i] .equals("")) {
                stack.add(strings[i]);
            }
        }
        String res = "";
    
        int len = stack.size();
        for (int i = 0; i < len; i++) {
            res += stack.pop();
            if (i < len -1) {
                res += " ";
            }
        }
        
        return res;
    }
    //        Queue<String> stack = new PriorityQueue<>();
    //        String string = "";
    //        for (int i = 0; i < s.length(); i++) {
    //
    //            if (!String.valueOf(s.charAt(i)) .equals(" ")) {
    //                string += String.valueOf(s.charAt(i));
    //            } else {
    //                if (!string.equals("")){
    //                    stack.add(string);
    //                    string = "";
    //                }
    //            }
    //
    //            if (i = s.length() -1) {
    //                stack.add(string);
    //            }
    //
    //        }
    //
    //        return stack.toString();
    //    }
}