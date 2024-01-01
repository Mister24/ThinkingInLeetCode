package leetcode.no0008_字符串转换整数;

class Solution {
    
    public static void main(String[] args) {
        System.out.println(myAtoi(" -42"));
        System.out.println(myAtoi("words and 987"));
    }
    
    public static int myAtoi(String s) {
        if (s.length() == 0) {
            return 0;
        }
        
        String str = getNumberString(s);
        if (str.startsWith("-")) {
            return 0 - Integer.valueOf(str.substring(1));
        }
        
        if (str.startsWith("-") || str.startsWith("+")) {
            return Integer.valueOf(str.substring(1));
        }
        
        return Integer.valueOf(str);
    }
    
    public static String getNumberString(String str) {
        // 去除空格
        str = getNumberStringData(str);
        
        String string = "";
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch == '-' && flag == 0 && !string.contains("-")) || (ch == '+' && flag == 0 && !string.contains("-"))
                    || (ch >= '0' && ch <= '9')) {
                string += String.valueOf(ch);
                if (ch == '+' || (ch >= '0' && ch <= '9')) {
                    flag = 1;
                }
            } else {
                break;
            }
        }
        
        return string;
    }
    
    
    public static String getNumberStringData(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
            } else {
                str += String.valueOf(ch);
            }
        }
        
        return str;
    }
}