package com.lyz.code;

import com.lyz.code.structure.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author lkunk
 * @date 2024年04月03日 22:20
 * @description
 */

public class main_1379 {
    //    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
//        Queue<TreeNode> queue1 = new ArrayDeque<>();
//        Queue<TreeNode> queue2 = new ArrayDeque<>();
//        queue1.add(original);
//        queue2.add(cloned);
//        while (!queue1.isEmpty()) {
//            TreeNode node1 = queue1.poll();
//            TreeNode node2 = queue2.poll();
//            if (node1 == target) {
//                return node2;
//            }
//            if (node1.left != null) {
//                queue1.add(node1.left);
//                queue2.add(node2.left);
//            }
//            if (node1.right != null) {
//                queue1.add(node1.right);
//                queue2.add(node2.right);
//            }
//        }
//        return null;
//    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) {
            return null;
        }
        if (original == target) {
            return cloned;
        }
        TreeNode node = getTargetCopy(original.left, cloned.left, target);
        if (node != null) {
            return node;
        }
        return getTargetCopy(original.right, cloned.right, target);
    }
}
