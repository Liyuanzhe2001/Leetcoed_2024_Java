package com.lyz.code;

import com.lyz.code.structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lkunk
 * @date 2024年02月08日 22:33
 * @description
 */

public class main_993 {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int s = queue.size();
            int n = 0;
            for (int i = 0; i < s; i++) {
                TreeNode node = queue.poll();
                n += node.val == x || node.val == y ? 1 : 0;
                int t = 0;
                if (node.left != null) {
                    queue.add(node.left);
                    t += node.left.val == x || node.left.val == y ? 1 : 0;
                }
                if (node.right != null) {
                    queue.add(node.right);
                    t += node.right.val == x || node.right.val == y ? 1 : 0;
                }
                if (t == 2) {
                    return false;
                }
            }
            if (n != 0) {
                return n == 2;
            }
        }
        return false;
    }
}
