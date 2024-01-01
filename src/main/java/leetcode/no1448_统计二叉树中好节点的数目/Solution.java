package leetcode.no1448_统计二叉树中好节点的数目;

class Solution {
    
    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    
    }
    
    public int dfs(TreeNode root, int max) {
        if (null == root) {
            return 0;
        }
        
        int res = 0;
        if (root.val >= max) {
            res++;
            max = root.val;
        }
        
        res += dfs(root.left, max) + dfs(root.right, max);
        
        return res;
    }
}