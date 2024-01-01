package leetcode.no0844_比较含退格的字符串;

class Solution {
    
    public static void main(String[] args) {
        System.out.println(backspaceCompare("a##c", "#a#c"));
    }
    
    public static boolean backspaceCompare(String s, String t) {
        String res1 = getRes(s);
        String res2 = getRes(t);
        
        if (res1.length() != res2.length()) {
            return false;
        }
        
        for (int i = 0; i < res1.length(); i++) {
            if (res1.charAt(i) != res2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static String getRes(String string) {
        if (string.length() == 0 || string == "#") {
            return "";
        }
        String res = "";
        for (int i = 0; i < string.length(); i++) {
            if ('#'!=string.charAt(i)) {
                res += string.charAt(i);
            } else {
                if (res.length() != 0) {
                    res = res.substring(0, res.length() - 1);
                }
            }
        }
        
        return res;
    }
}