package com.lyz.code;

import com.lyz.code.structure.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lkunk
 * @date 2024年02月20日 13:41
 * @description
 */

public class main_105 {
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(0, preorder.length - 1, preorder, 0, inorder.length - 1, inorder);
    }

    public TreeNode build(int preLef, int preRig, int[] preorder, int inLef, int inRig, int[] inorder) {
        if (preLef > preRig) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[preLef]);
        int size = map.get(preorder[preLef]) - inLef;
        node.left = build(preLef + 1, preLef + size, preorder, inLef, inRig - 1, inorder);
        node.right = build(preLef + size + 1, preRig, preorder, map.get(preorder[preLef]) + 1, inRig, inorder);
        return node;
    }

}
