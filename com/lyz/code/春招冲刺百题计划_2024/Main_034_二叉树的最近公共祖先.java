package com.lyz.code.春招冲刺百题计划_2024;

import com.lyz.code.structure.TreeNode;
import com.sun.source.tree.Tree;

/**
 * @author lkunk
 * @date 2024年04月08日 20:51
 * @description
 */

public class Main_034_二叉树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode lef = lowestCommonAncestor(root.left, p, q);
        TreeNode rig = lowestCommonAncestor(root.right, p, q);
        if (lef == null) {
            return rig;
        }
        if (rig == null) {
            return lef;
        }
        return root;
    }

}
