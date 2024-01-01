package leetcode.no1448_统计二叉树中好节点的数目;

public class TreeNode {
    
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