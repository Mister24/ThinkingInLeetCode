package leetcode.no338_比特位计数;

class Solution {
    public int[] countBits(int n) {
        int[] ints = new int[n+1];
        for (int i = 0; i <= n; i++) {
            ints[n] = calTimes(i);
        }
        
        return ints;
    }
    
    public int calTimes(int num) {
        int times = 0;
        while (num > 0) {
            num = num & (num - 1);
            times++;
        }
        
        return times;
    }
}