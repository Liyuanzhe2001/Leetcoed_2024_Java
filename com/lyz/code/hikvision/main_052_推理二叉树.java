package com.lyz.code.hikvision;

import com.lyz.code.structure.TreeNode;

import java.util.HashMap;

/**
 * @author lkunk
 * @date 2024年03月08日 16:22
 * @description
 */

public class main_052_推理二叉树 {
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode deduceTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(0, preorder.length - 1, 0, inorder.length - 1, preorder, inorder);
    }

    public TreeNode buildTree(int preLef, int preRig, int inLef, int inRig, int[] preorder, int[] inorder) {
        if (preLef > preRig) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preLef]);
        int len = map.get(preorder[preLef]) - inLef;
        root.left = buildTree(preLef + 1, preLef + len, inLef, inLef + len - 1, preorder, inorder);
        root.right = buildTree(preLef + len + 1, preRig, inLef + len + 1, inRig, preorder, inorder);
        return root;
    }

}
