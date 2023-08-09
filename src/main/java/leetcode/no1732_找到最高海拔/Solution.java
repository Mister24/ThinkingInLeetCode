package leetcode.no1732_找到最高海拔;

class Solution {
    
    public int largestAltitude(int[] gain) {
        if (gain == null) {
            return 0;
        }
        
        int sum = 0;
        int res = 0;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            
            if (sum > res) {
                res = sum;
            }
        }
        
        return res;
    }
}