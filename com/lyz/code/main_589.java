package com.lyz.code;

import com.lyz.code.structure.Node;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年02月18日 17:36
 * @description
 */

public class main_589 {

    List<Integer> res = new LinkedList<>();

    public List<Integer> preorder(Node root) {
        dfs(root);
        return res;
    }

    void dfs(Node root) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        for (Node child : root.children) {
            dfs(child);
        }
    }
}
