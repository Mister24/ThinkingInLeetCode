package leetcode.no0094_二叉树的中序遍历;

import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Solution {
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        root.right = right;
        right.left = new TreeNode(3);
        
        System.out.println(inorderTraversal(root));
    }
    
    public static void travel(List<Integer> list, TreeNode root) {
        if (null == root) {
            return;
        }
        
        travel(list, root.left);
        list.add(root.val);
        travel(list, root.right);
    }
    
    public static List<Integer> inorderTraversal(TreeNode root) {
        if (null == root) {
            return new ArrayList<>();
        }
        
        List<Integer> list = new ArrayList<>();
        travel(list, root);
        
        return list;
    }
}