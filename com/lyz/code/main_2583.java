package com.lyz.code;

import com.lyz.code.structure.TreeNode;

import java.util.*;

/**
 * @author lkunk
 * @date 2024年02月23日 20:09
 * @description
 */

public class main_2583 {
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Long> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            list.add(sum);
        }
        Collections.sort(list);
        if (list.size() < k) {
            return -1;
        }
        return list.get(list.size() - k);
    }
}
