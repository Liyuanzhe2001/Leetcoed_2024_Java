package com.lyz.code;

import com.lyz.code.structure.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author lkunk
 * @date 2024年02月17日 15:18
 * @description
 */

public class main_429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root != null) {
            return res;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int s = queue.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < s; i++) {
                Node node = queue.poll();
                for (Node child : node.children) {
                    queue.add(child);
                }
                list.add(node.val);
            }
            res.add(list);
        }
        return res;
    }
}
