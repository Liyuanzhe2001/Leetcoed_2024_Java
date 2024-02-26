package com.lyz.code;

import com.lyz.code.structure.TreeNode;

/**
 * @author lkunk
 * @date 2024年02月26日 13:17
 * @description
 */

public class main_938 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
