package leetcode104_二叉树的最大深度;

class Solution {
    
    public static void main(String[] args) {
    
    }
    
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int maxDepthLeft = maxDepth(root.left);
        int maxDepthRight = maxDepth(root.right);
        
        return maxDepthLeft > maxDepthRight ? maxDepthLeft + 1 : maxDepthRight + 1;
    }
    
    public int maxDepth1(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}

class TreeNode {
    
    int val;
    
    TreeNode left;
    
    TreeNode right;
    
    TreeNode() {
    }
    
    TreeNode(int val) {
        this.val = val;
    }
    
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}