package leetcode.no1137_第N个斐波那契数;

class Solution {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        
        return tribonacci(n-3) + tribonacci(n-2) + tribonacci(n-1);
    }
    
    public int tribonacci1(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
    
        int num0 = 0, num1 = 1, num2 = 1;
        for (int i = 3; i <= n; i++) {
            int num3 = num0 + num1 + num2;
            num0 = num1;
            num1 = num2;
            num2 = num3;
        }
        
        // 也就是num3
        return num2;
    }
}