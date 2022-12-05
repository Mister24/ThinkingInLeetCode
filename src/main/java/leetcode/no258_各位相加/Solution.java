package leetcode.no258_各位相加;

class Solution {
    
    public int addDigits(int num) {
        while (num >= 10) {
            num = num / 10 + num % 10;
        }
        
        return num;
    }
}