package com.lyz.code;

import com.lyz.code.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年02月11日 22:10
 * @description
 */

public class main_144 {

    public List<Integer> res = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);
        return res;
    }

    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        res.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }

}
