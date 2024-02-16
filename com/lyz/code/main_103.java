package com.lyz.code;

import com.lyz.code.structure.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author lkunk
 * @date 2024年02月16日 14:47
 * @description
 */

public class main_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;
        while (!queue.isEmpty()) {
            int s = queue.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < s; i++) {
                TreeNode node = queue.poll();
                if (flag) {
                    list.add(0, node.val);
                } else {
                    list.add(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            flag = !flag;
            res.add(list);
        }
        return res;
    }
}
