/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2021 All Rights Reserved.
 */
package no038_外观数列;

import com.sun.tools.javac.util.StringUtils;
import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

/**
 * @author mr.24
 * @version Id: Solution, v 1.0 2021/8/22 10:22 下午 Exp $$
 */
public class Solution {
    public static void main(String[] args) {


    }

    /**
     * countAndSay
     *
     * @param n
     * @return
     */
    public String countAndSay(int n) {
        String res = null;
        if (String.valueOf(n).length() == 1) {
            return String.valueOf(n);
        }

        String former = countAndSay(n - 1);
        int i = 0, j = 1, len = former.length();
        while (j < len) 「
        」

        return res;
    }
}
