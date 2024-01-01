package leetcode.no0496_下一个更大元素I;

class Solution {
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            if (nums2.length < i + 1) {
                res[i] = -1;
                continue;
            }
            for (int j = i; j < nums2.length; j++) {
                if (nums2[j] > nums1[i] && nums2[j] > res[i]) {
                    res[i] = nums2[j];
                    continue;
                }
                if (j == nums2.length) {
//                    int tmp = res[i];
                    if (res[i] == 0) {
                        res[i] = -1;
                    }
                }
            }
            
        }
        
        return res;
    }
}