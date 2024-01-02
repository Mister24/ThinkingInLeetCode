package leetcode.no1004_最大连续1的个数III;

/**
 * def findSubArray(nums):
 *     N = len(nums) # 数组/字符串长度
 *     left, right = 0, 0 # 双指针，表示当前遍历的区间[left, right]，闭区间
 *     sums = 0 # 用于统计 子数组/子区间 是否有效，根据题目可能会改成求和/计数
 *     res = 0 # 保存最大的满足题目要求的 子数组/子串 长度
 *     while right < N: # 当右边的指针没有搜索到 数组/字符串 的结尾
 *         sums += nums[right] # 增加当前右边指针的数字/字符的求和/计数
 *         while 区间[left, right]不符合题意: # 此时需要一直移动左指针，直至找到一个符合题意的区间
 *             sums -= nums[left] # 移动左指针前需要从counter中减少left位置字符的求和/计数
 *             left += 1 # 真正的移动左指针，注意不能跟上面一行代码写反
 *         # 到 while 结束时，我们找到了一个符合题意要求的 子数组/子串
 *         res = max(res, right - left + 1) # 需要更新结果
 *         right += 1 # 移动右指针，去探索新的区间
 *     return res
 *
 * 作者：负雪明烛
 * 链接：https://leetcode.cn/problems/max-consecutive-ones-iii/solutions/609055/fen-xiang-hua-dong-chuang-kou-mo-ban-mia-f76z/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
class Solution {
    public int longestOnes(int[] nums, int k) {
        int len = nums.length;
        int res = 0;
        int left = 0, right = 0;
        int zeros = 0;
        while (right < len) {
            if (nums[right] == 0) {
                zeros++;
            }
            while (zeros > k) {
                if (nums[left++] == 0) {
                    zeros--;
                }
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        
        return res;
    }
}