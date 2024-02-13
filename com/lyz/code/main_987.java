package com.lyz.code;

import com.lyz.code.structure.TreeNode;

import java.util.*;

/**
 * @author lkunk
 * @date 2024年02月13日 21:07
 * @description
 */

public class main_987 {

    List<int[]> nodes = new ArrayList<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        dfs(root, 0, 0);
        Collections.sort(nodes, new Comparator<int[]>() {
            public int compare(int[] tuple1, int[] tuple2) {
                if (tuple1[0] != tuple2[0]) {
                    return tuple1[0] - tuple2[0];
                } else if (tuple1[1] != tuple2[1]) {
                    return tuple1[1] - tuple2[1];
                } else {
                    return tuple1[2] - tuple2[2];
                }
            }
        });
        List<List<Integer>> res = new ArrayList<>();
        int size = 0;
        int lastCol = Integer.MIN_VALUE;
        for (int[] node : nodes) {
            int col = node[0];
            int value = node[2];
            if (col != lastCol) {
                lastCol = col;
                res.add(new ArrayList<>());
                size++;
            }
            res.get(size - 1).add(value);
        }
        return res;
    }

    public void dfs(TreeNode node, int row, int col) {
        if (node == null) {
            return;
        }
        nodes.add(new int[]{col, row, node.val});
        dfs(node.left, row + 1, col - 1);
        dfs(node.right, row + 1, col + 1);
    }

}
