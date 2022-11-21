package leetcode.no0171_Excel表列序号;

class Solution {
    
    
    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        if (columnTitle.length() == 0) {
            return 0;
        }
        
        int res = 0;
        for (int i = 0; i < len; i++) {
            res += (columnTitle.charAt(i) - 'A' + 1) * Math.pow(26, len - i - 1);
        }
        
        return res;
    }
}