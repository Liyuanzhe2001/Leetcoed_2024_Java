package com.lyz.code.春招冲刺百题计划_2024;

import com.lyz.code.structure.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author lkunk
 * @date 2024年04月08日 20:57
 * @description
 */

public class Main_035_二叉树的锯齿形层序遍历 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int s = queue.size();
            boolean f = res.size() % 2 == 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < s; i++) {
                TreeNode node = queue.poll();
                if (f) {
                    list.add(node.val);
                } else {
                    list.add(0, node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}
