package leetcode.no0404_左叶子之和;

class Solution {
    
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int res = 0;
        
        if (root != null && root.left != null && (root.left.left == null && root.left.right == null)) {
            res += root.left.val;
        }
        
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right) + res;
    }
}