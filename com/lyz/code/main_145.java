package com.lyz.code;

import com.lyz.code.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年02月12日 0:02
 * @description
 */

public class main_145 {
    List<Integer> res = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        dfs(root);
        return res;
    }

    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        dfs(node.right);
        res.add(node.val);
    }
}
