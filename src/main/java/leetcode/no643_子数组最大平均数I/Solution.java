package leetcode.no643_子数组最大平均数I;

class Solution {
    
    public static void main(String[] args) {
        int[] nums = new int[1];
        nums[0] = 1;
        System.out.println(findMaxAverage(nums, 1));
    }
    
    public static double findMaxAverage(int[] nums, int k) {
        double sum = -10001 * k;
        for (int i = 0; i <= nums.length - k; i++) {
            double temp = 0;
            for (int j = i; j < i + k; j++) {
                temp += nums[j];
            }
            if (temp > sum) {
                sum = temp;
            }
        }
        
        return 1.0 * sum / k;
    }
}