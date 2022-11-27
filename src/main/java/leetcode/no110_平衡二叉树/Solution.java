package leetcode.no110_平衡二叉树;

class Solution {
    
    public boolean isBalanced(TreeNode root) {
        if (null == root || (null == root.left && null == root.right)) {
            return true;
        }
        
        return Math.abs(getHeight(root.right) - getHeight(root.left)) <= 1  && isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int getHeight(TreeNode node) {
        if (null == node) {
            return 0;
        } else {
            return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        }
    }
}