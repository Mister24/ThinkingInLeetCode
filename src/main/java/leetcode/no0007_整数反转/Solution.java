package leetcode.no0007_整数反转;

import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        System.out.println(reverse1(1534236469));

        System.out.println(reverse(132));
        System.out.println(reverse1(132));

        System.out.println(reverse(-132));
        System.out.println(reverse1(-132));

    }

    public static int reverse1(int x) {
        if (String.valueOf(x).startsWith("-")) {
            return -1 * doReverse1(x * -1);
        } else {
            return doReverse1(x);
        }
    }

    private static int doReverse1(int x) {
        int result = 0;
        while (0 != x) {
            int tmp = x % 10;
            if (result > 214748364 || result == 214748364 && tmp > 7) {
                return 0;
            } else if (result < -214748364 || result == -214748364 && tmp < -8) {
                return 0;
            }

            result = result * 10 + tmp;
            x /= 10;

        }
        return result;
    }

    public static int reverse(int x) {
        try {
            if (0 == x) {
                return x;
            }
            String string = String.valueOf(x);
            if (string.startsWith("-")) {
                return Integer.parseInt("-" + doReverse(string.substring(1)));
            } else if (string.endsWith("0")) {
                return Integer.parseInt(doReverse(string.substring(0, string.length() - 1)));
            } else {
                return Integer.parseInt(doReverse(string));
            }
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static String doReverse(String originString) {
        Stack stack = new Stack();
        for (int i = 0; i < originString.length(); i++) {
            stack.push(originString.charAt(i));
        }

        StringBuilder s = new StringBuilder();
        while (!stack.isEmpty()) {
            s.append(stack.pop());
        }


        return s.toString();
    }
}