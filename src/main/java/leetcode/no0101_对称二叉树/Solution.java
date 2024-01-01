package leetcode.no0101_对称二叉树;

class Solution {
    
    public boolean isSymmetric(TreeNode root) {
        if (null == root) {
            return true;
        }
        
        return compare(root.left, root.right);
    }
    
    boolean compare(TreeNode left, TreeNode right) {
        if (null == left && null == right) {
            return true;
        }
        
        if (null == left || null == right) {
            return false;
        }
        
        // 比较node的值
        if (left.val != right.val) {
            return false;
        }
        
        // 递归比较两棵树的子树
        return compare(left.left, right.right) && compare(left.right, right.left);
    }
}