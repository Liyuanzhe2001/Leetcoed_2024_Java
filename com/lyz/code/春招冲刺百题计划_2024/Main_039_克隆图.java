package com.lyz.code.春招冲刺百题计划_2024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lkunk
 * @date 2024年04月09日 23:09
 * @description
 */

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class Main_039_克隆图 {
    Map<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        return dfs(node);
    }

    public Node dfs(Node node) {
        if (node == null) {
            return null;
        }
        if (visited.containsKey(node)) {
            return visited.get(node);
        }
        Node res = new Node(node.val, new ArrayList<>());
        visited.put(node, res);
        for (Node neighbor : node.neighbors) {
            visited.get(node).neighbors.add(dfs(neighbor));
        }
        return res;
    }
}
