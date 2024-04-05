package com.lyz.code;

import com.lyz.code.structure.TreeNode;

/**
 * @author lkunk
 * @date 2024年04月05日 22:19
 * @description
 */

public class main_1026 {
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }

    public int dfs(TreeNode node, int max, int min) {
        if (node == null) {
            return max - min;
        }
        max = Math.max(node.val, max);
        min = Math.min(node.val, min);
        return Math.max(dfs(node.left, max, min), dfs(node.right, max, min));
    }

}
