package leetcode.no46_全排列;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    
    public static void main(String[] args) {
        int[] ints = new int[]{1,2,3};
        System.out.println(permute(ints));
    }
    public static List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return null;
        }
        List<List<Integer>> list = new ArrayList<>();
        boolean[] filled = new boolean[len];
        // 记录一次排列中，参与的列的情况
        Deque<Integer> path = new ArrayDeque<>(len);
        dfs(nums, len, 0, path, filled, list);
        
        return list;
    }
    
    private static void dfs(int[] nums, int length, int depth, Deque<Integer> path, boolean[] filled, List<List<Integer>> res) {
        if (depth == length) {
            // 一次排列结束，加入结果集
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < length; i++) {
            if (!filled[i]) {
                // 记录
                path.addLast(nums[i]);
                filled[i] = true;
                dfs(nums, length, depth + 1, path, filled, res);
                // 移除
                filled[i] = false;
                path.removeLast();
            }
        }
    }
}