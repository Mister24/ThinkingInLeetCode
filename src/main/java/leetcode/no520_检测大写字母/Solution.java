package leetcode.no520_检测大写字母;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("FlaG"));
    }
    
    public static boolean detectCapitalUse(String word) {
        int len = word.length();
        int len1 = len-1;
        if (len == 0) {
            return false;
        }
        Pattern pattern1 = Pattern.compile("[A-Z]{" + len + "}");
        Pattern pattern2 = Pattern.compile("[a-z]{" + len + "}");
        Pattern pattern3 = Pattern.compile("^[A-Z][a-z]{" + len1 + "}");
        Matcher matcher1 = pattern1.matcher(word);
        Matcher matcher2 = pattern2.matcher(word);
        Matcher matcher3 = pattern3.matcher(word);
        return matcher1.find() || matcher2.find() || matcher3.find();
    }
}