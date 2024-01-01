package leetcode.no0434_字符串中的单词数;

class Solution {
    public int countSegments(String s) {
        if (s.length() == 0) {
            return 0;
        }
    
        String[] strings = s.split(" ");
        
        return strings.length;
    }
}