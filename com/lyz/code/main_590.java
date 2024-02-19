package com.lyz.code;

import com.lyz.code.structure.Node;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年02月19日 14:59
 * @description
 */

public class main_590 {
    List<Integer> res = new LinkedList<>();

    public List<Integer> postorder(Node root) {
        dfs(root);
        return res;
    }

    void dfs(Node node) {
        if (node == null) {
            return;
        }
        for (Node child : node.children) {
            dfs(child);
        }
        res.add(node.val);
    }

}
