package com.lyz.code;

import com.lyz.code.structure.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年04月02日 20:42
 * @description
 */

public class main_894 {
    private static final List<TreeNode>[] f = new ArrayList[11];

    static {
        Arrays.setAll(f, i -> new ArrayList<>());
        f[1].add(new TreeNode());
        for (int i = 2; i < f.length; i++) {
            for (int j = 1; j < i; j++) {
                for (TreeNode left : f[j]) {
                    for (TreeNode right : f[i - j]) {
                        f[i].add(new TreeNode(0, left, right));
                    }
                }
            }
        }
    }

    public List<TreeNode> allPossibleFBT(int n) {
        return f[n % 2 > 0 ? (n + 1) / 2 : 0];
    }
}
