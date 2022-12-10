package leetcode.no485_最大连续1的个数;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Solution {
    
    public static void main(String[] args) {
        int[] ints = new int[6];
        ints[0] = 1;
        ints[1] = 1;
        ints[2] = 0;
        ints[3] = 1;
        ints[4] = 1;
        ints[5] = 1;
        System.out.println(findMaxConsecutiveOnes(ints));
    }
    
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxSum = 0;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentSum++;
                if (i == nums.length - 1) {
                    maxSum = maxSum > currentSum ? maxSum : currentSum;
                }
            } else {
                maxSum = maxSum > currentSum ? maxSum : currentSum;
                currentSum = 0;
            }
        }
        
        return maxSum;
    }
}