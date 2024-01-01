package leetcode.no0058_最后一个单次的长度;

class Solution {
    public int lengthOfLastWord(String s) {
        if (null == s || 0 == s.length()) {
            return 0;
        }
        
        //
        String[] strings = s.split(" ");
        return strings[strings.length - 1].length();
    }
}