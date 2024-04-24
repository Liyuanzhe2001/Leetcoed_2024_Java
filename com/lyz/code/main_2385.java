package com.lyz.code;

import com.lyz.code.structure.TreeNode;

/**
 * @author lkunk
 * @date 2024年04月24日 23:46
 * @description
 */

public class main_2385 {
    private int ans;

    public int amountOfTime(TreeNode root, int start) {
        dfs(root, start);
        return ans;
    }

    private int dfs(TreeNode node, int start) {
        if (node == null) {
            return 0;
        }
        int lLen = dfs(node.left, start);
        int rLen = dfs(node.right, start);
        if (node.val == start) {
            // 计算子树 start 的最大深度
            ans = -Math.min(lLen, rLen); // 负负得正
            return 1; // 用正数表示找到了 start
        }
        if (lLen > 0 || rLen > 0) {
            // 只有在左子树或右子树包含 start 时，才能更新答案
            ans = Math.max(ans, Math.abs(lLen) + Math.abs(rLen)); // 两条链拼成直径
            return Math.max(lLen, rLen) + 1; // max 会自动取到正数
        }
        return Math.min(lLen, rLen) - 1; // 用负数表示没有找到 start
    }
}
