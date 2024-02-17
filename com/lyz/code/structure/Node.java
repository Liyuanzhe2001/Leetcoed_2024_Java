package com.lyz.code.structure;

import java.util.List;

/**
 * @author lkunk
 * @date 2024年02月17日 15:20
 * @description
 */

public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
