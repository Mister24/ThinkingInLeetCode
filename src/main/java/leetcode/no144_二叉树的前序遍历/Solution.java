package leetcode.no144_二叉树的前序遍历;

import java.util.ArrayList;
import java.util.List;

class Solution {
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
//        if (null == root) {
//            return null;
//        }
        preOrder(root, list);
        return list;
    }
    
    public void preOrder(TreeNode node, List<Integer> res) {
        if (null == node) {
            return;
        }
        
        res.add(node.val);
        preOrder(node.left, res);
        preOrder(node.right, res);
    }
}