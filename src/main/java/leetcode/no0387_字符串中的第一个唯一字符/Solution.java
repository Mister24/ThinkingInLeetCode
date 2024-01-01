package leetcode.no0387_字符串中的第一个唯一字符;

class Solution {
    public int firstUniqChar(String s) {
        if (s.length() == 0 || s.length() ==1) {
            return 0;
        }
        int index=0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i)!=s.charAt(index)) {
                if (i==s.length()-1){
                    return index;
                }
            } else {
                index++;
            }
        }
       return index;
    }
}