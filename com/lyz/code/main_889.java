package com.lyz.code;

import com.lyz.code.structure.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lkunk
 * @date 2024年02月22日 23:00
 * @description
 */

public class main_889 {

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return build(preorder, postorder, 0, postorder.length, 0, postorder.length - 1);
    }

    public TreeNode build(int[] preorder, int[] postorder, int preLef, int preRig, int postLef, int postRig) {
        int n = preRig - preLef;
        if (n == 0) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[preLef]);
        if (n == 1) {
            return node;
        }

        int l = 0;
        for (int i = 0; i < n; i++) {
            if (postorder[postLef + i] == preorder[preLef + 1]) {
                l = i + 1;
                break;
            }
        }
        node.left = build(preorder, postorder, preLef + 1, preLef + l + 1, postLef, postLef + l);
        node.right = build(preorder, postorder, preLef + l + 1, preRig, postLef + l, postRig - 1);
        return node;
    }
}
