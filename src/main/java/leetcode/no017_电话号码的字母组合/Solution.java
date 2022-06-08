/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2021 All Rights Reserved.
 */
package leetcode.no017_电话号码的字母组合;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mr.24
 * @version Id: Solution, v 1.0 2021/9/19 4:56 下午 Exp $$
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(letterCombinations(null));
        System.out.println(letterCombinations(""));
        System.out.println(letterCombinations("2"));
        System.out.println(letterCombinations("23"));
        System.out.println(letterCombinations("234"));
    }

    /**
     * 电话号码的字母组合
     *
     * @param digits
     * @return
     */
    public static List<String> letterCombinations(String digits) {
        if ("".equals(digits)) {
            return new ArrayList<String>();
        }
        if (null == digits) {
            return null;
        }
        String[] strings = new String[]{
                "", "abc", "def",
                "ghi", "jkl", "mno",
                "pqrs", "tuv", "wxyz"
        };

        if (digits.length() == 1) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < strings[Integer.valueOf(digits) - 1].length(); i++) {
                list.add(String.valueOf(strings[Integer.valueOf(digits) - 1].charAt(i)));
            }

            return list;
        }

        // 用第一个字母，依次与之前依次的list结果的每一项做拼接
        List<String> tmp = letterCombinations(digits.substring(1));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings[Integer.valueOf(String.valueOf(digits.charAt(0))) - 1].length(); i++) {
            for (int j = 0; j < tmp.size(); j++) {
                list.add(String.valueOf(strings[Integer.valueOf(String.valueOf(digits.charAt(0)))-1].charAt(i)) + tmp.get(j));
            }
        }

        return list;
    }
}
