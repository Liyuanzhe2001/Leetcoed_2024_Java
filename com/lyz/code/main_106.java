package com.lyz.code;

import com.lyz.code.structure.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lkunk
 * @date 2024年02月21日 23:01
 * @description
 */

public class main_106 {

    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    public TreeNode build(int[] inorder, int[] postorder, int inLef, int inRig, int postLef, int postRig) {
        if (postLef > postRig) {
            return null;
        }
        TreeNode node = new TreeNode(postorder[postRig]);
        int size = inRig - map.get(postorder[postRig]);
        node.left = build(inorder, postorder, inLef, map.get(postorder[postRig]) - 1, postLef, postRig - size - 1);
        node.right = build(inorder, postorder, map.get(postorder[postRig]) + 1, inRig, postRig - size, postRig - 1);
        return node;
    }

}
