package leetcode.no652_寻找重复的子树;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    Map<String, Integer> map = new HashMap<>();
    List<TreeNode> treeNodes = new ArrayList<>();
    
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        
        return treeNodes;
    }
    
    String dfs(TreeNode root) {
        if (null == root) {
            return " ";
        }
        
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(root.val).append("|")
                .append(dfs(root.left))
                .append(dfs(root.right));
        String key = stringBuilder.toString();
        // 放入
        map.put(key, map.getOrDefault(key, 0) + 1);
        // 判断是否符合
        if (map.get(key) == 2) {
            treeNodes.add(root);
        }
        
        return key;
    }
}