/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2021 All Rights Reserved.
 */
package no020_有效的括号;

import com.sun.tracing.dtrace.Attributes;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

/**
 * @author mr.24
 * @version Id: Solution, v 1.0 2021/10/8 11:46 上午 Exp $$
 */
public class Solution {
    public static void main(String[] args) {

        String string = "123";
        char[] chars = new char[3];
        chars = string.toCharArray();
        System.out.println(chars);

        System.out.println(isValid("){"));
    }


    public static boolean isValid(String s) {
        if (null == s) {
            return true;
        }
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Map<Character, Character> reverseMap = new HashMap<>();
        reverseMap.put(')', '(');
        reverseMap.put(']', '[');
        reverseMap.put('}', '{');

        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (reverseMap.containsKey(s.charAt(i))) {
                if (stack.empty()) {
                    return false;
                }
                if (Objects.equals(stack.peek(), reverseMap.get(s.charAt(i)))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if (stack.empty()) {
            return true;
        }

        return false;
    }
}
