package com.lyz.code.春招冲刺百题计划_2024;

import com.lyz.code.structure.TreeNode;

/**
 * @author lkunk
 * @date 2024年04月08日 20:47
 * @description
 */

public class Main_033_相同的树 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
