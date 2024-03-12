package com.lyz.code;

import com.lyz.code.structure.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lkunk
 * @date 2024年03月12日 21:45
 * @description
 */

public class main_1261 {

    class FindElements {

        Set<Integer> set = new HashSet<>();

        public FindElements(TreeNode root) {
            dfs(root, 0);
        }

        public void dfs(TreeNode node, int val) {
            if (node == null) {
                return;
            }
            set.add(val);
            node.val = val;
            dfs(node.left, 2 * val + 1);
            dfs(node.right, 2 * val + 2);
        }

        public boolean find(int target) {
            return set.contains(target);
        }
    }
}
