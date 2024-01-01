package leetcode.no0066_加一;

import java.util.Arrays;

class Solution {
    
    public static void main(String[] args) {
        int[] ints = new int[1];
        ints[0] = 9;
    
        System.out.println(plusOne(ints));
//        System.out.println(plusOne(ints)[1]);
    }
    
    public static int[] plusOne(int[] digits) {
        if (digits == null) {
            return null;
        }
        
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            
            return digits;
        }
        
        int add = 0;
        for (int i = 0; i <= digits.length - 1; i++) {
            if (i == 0) {
                int tmp =digits[digits.length - 1 - i] + 1;
                digits[digits.length - 1 - i] = (tmp) % 10;
                add = (tmp) / 10;
            }
            digits[digits.length - 1 - i] = (digits[digits.length - 1 - i] + add) % 10;
            add = (digits[digits.length - 1 - i] + add) / 10;
        }
        
        if (digits[0] >= 10) {
            int[] res = new int[digits.length + 1];
            for (int i = 0; i < digits.length - 2; i++) {
                res[digits.length - 1 - i] = digits[digits.length - 1 - i];
            }
            res[1] = digits[0] - 10;
            res[0] = 1;
            
            return res;
        }
        return digits;
    }
}