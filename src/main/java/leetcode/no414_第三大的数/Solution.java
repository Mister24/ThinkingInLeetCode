package leetcode.no414_第三大的数;

class Solution {
    
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 2;
//        nums[2] = -2147483648;
        nums[2] = 1;
        
        System.out.println(thirdMax(nums));
    }
    
    public static int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max1 == nums[i]||max2 == nums[i]||max3 == nums[i]){
                continue;
            }
            if (nums[i] > max1 && nums[i] > max2 && nums[i] > max3) {
                max1 = max2;
                max2 = max3;
                max3 = nums[i];
            } else if (nums[i] > max1 && nums[i] > max2) {
                max1 = max2;
                max2 = nums[i];
            } else if (nums[i] > max1) {
                max1 = nums[i];
            }
        }
        
        return max1 == Long.MIN_VALUE ? (int)max3 : (int)max1;
        
//        if (max1 != Integer.MIN_VALUE && max2 !=  Integer.MIN_VALUE && max3 !=  Integer.MIN_VALUE) {
//            return max3;
//        } else if (max2 !=  Integer.MIN_VALUE && max3 !=  Integer.MIN_VALUE) {
//            return max2;
//        }
//
//        return max1;
    }
}