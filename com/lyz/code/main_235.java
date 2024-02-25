package com.lyz.code;

import com.lyz.code.structure.TreeNode;

/**
 * @author lkunk
 * @date 2024年02月25日 12:53
 * @description
 */

public class main_235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int max = Math.max(p.val, q.val);
        int min = Math.min(p.val, q.val);
        int val = root.val;
        if (val < min) {
            return lowestCommonAncestor(root.right, p, q);
        }
        if (val > max) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }
}
