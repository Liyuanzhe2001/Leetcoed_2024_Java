package com.lyz.code;

import com.lyz.code.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author lkunk
 * @date 2024年02月07日 21:14
 * @description
 */

public class main_2641 {
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        root.val = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> twoNumSumList = new ArrayList<>();
            int sum = 0;
            for (TreeNode treeNode : queue) {
                int twoNumSum = 0;
                if (treeNode.left != null) {
                    twoNumSum += treeNode.left.val;
                    sum += treeNode.left.val;
                }
                if (treeNode.right != null) {
                    twoNumSum += treeNode.right.val;
                    sum += treeNode.right.val;
                }
                twoNumSumList.add(twoNumSum);
            }
            for (int i = 0; i < twoNumSumList.size(); i++) {
                TreeNode treeNode = queue.poll();
                int v = sum - twoNumSumList.get(i);
                if (treeNode.left != null) {
                    treeNode.left.val = v;
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    treeNode.right.val = v;
                    queue.add(treeNode.right);
                }
            }
        }
        return root;
    }
}
