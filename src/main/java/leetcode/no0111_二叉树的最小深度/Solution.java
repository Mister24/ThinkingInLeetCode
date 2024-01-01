package leetcode.no0111_二叉树的最小深度;

class Solution {
    public int minDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
    
        if (null == root.left && null == root.right) {
            return 1;
        }
        
        int minLef = minDepth(root.left);
        int minRig = minDepth(root.right);
        
        if (root.left == null || root.right == null) {
            return minLef + minRig + 1;
        }
        
        return Math.min(minLef, minRig) + 1;
    }
    
}