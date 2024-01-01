package leetcode.no0342_4的幂;

class Solution {
    
    public boolean isPowerOfFour(int n) {
        if (n < 0) {
            return false;
        }
        
        if (n == 1) {
            return true;
        }
        
        while (n > 0) {
            if (n % 4 == 0) {
                n = n / 4;
            } else {
                return false;
            }
            
            if (n == 1) {
                return true;
            }
        }
        
        return false;
    }
}