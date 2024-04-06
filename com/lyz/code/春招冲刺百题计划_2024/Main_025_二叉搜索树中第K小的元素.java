package com.lyz.code.春招冲刺百题计划_2024;

import com.lyz.code.structure.TreeNode;

/**
 * @author lkunk
 * @date 2024年04月06日 22:30
 * @description
 */

public class Main_025_二叉搜索树中第K小的元素 {
    int res, k;

    void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (k == 0) {
            return;
        }
        if (k == 1) {
            res = root.val;
        }
        k--;
        dfs(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }
}
