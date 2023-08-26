package leetcode.no872_叶子相似的树;


import java.util.ArrayList;
import java.util.List;

class Solution {
    
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node11 = new TreeNode(2);
        TreeNode node12 = new TreeNode(2);
        node1.left = node11;
        node1.right = node12;
    
        TreeNode node2 = new TreeNode(1);
        TreeNode node21 = new TreeNode(3);
        TreeNode node22 = new TreeNode(2);
        node2.left = node21;
        node2.right = node22;
        
        System.out.println(leafSimilar(node1, node2));
        System.out.println(leafSimilar(node1, node2));
    }
    
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> ints1 = new ArrayList<>();
        List<Integer> ints2 = new ArrayList<>();
        if (root1 != null) {
            dfs(root1, ints1);
        }
        if (root2 != null) {
            dfs(root2, ints2);
        }
        
        return ints1.equals(ints2);
        
    }
    
    public static void dfs(TreeNode node, List<Integer> ints) {
        if (node.left == null && node.right == null) {
            ints.add(node.val);
        } else {
            if (node.left != null) {
                dfs(node.left, ints);
            }
            if (node.right != null) {
                dfs(node.right, ints);
            }
        }
    }
}