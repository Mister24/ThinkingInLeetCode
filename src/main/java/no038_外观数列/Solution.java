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
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
    }

    /**
     * countAndSay
     *
     * @param n
     * @return
     */
    public static String countAndSay(int n) {
        String str = "";
        if (1 == n) {
            return String.valueOf(n);
        }

        String former = countAndSay(n - 1);
        int i = 0, j = 1, len = former.length();
        while (j < len) {
            if (i == len) {
                str = str + "1" + former.charAt(len - 1);
                break;
            }

            if (j == len) {
                str = str + String.valueOf(j - i) + former.charAt(i);
            }

            if (former.charAt(i) == former.charAt(j)) {
                //
                j++;
            } else {
                str = str + String.valueOf(j - i) + former.charAt(i);
                i = j;
                j++;
            }
        }

        str = str + (j -i) + former.charAt(i);

        return str;
    }
}
