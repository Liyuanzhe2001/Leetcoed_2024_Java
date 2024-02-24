package com.lyz.code;

import com.lyz.code.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年02月24日 22:47
 * @description
 */

public class main_2476 {

    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        dfs(root);
        List<List<Integer>> res = new ArrayList<>();
        for (Integer query : queries) {
            int lef = 0;
            int rig = list.size() - 1;
            while (lef <= rig) {
                int mid = lef + (rig - lef) / 2;
                if (list.get(mid) > query) {
                    rig = mid - 1;
                } else {
                    lef = mid + 1;
                }
            }
            System.out.println(lef);
            int maxVal = -1;
            int minVal = -1;
            lef--;
            if (lef != -1) {
                minVal = list.get(lef);
                if (minVal == query) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(minVal);
                    tmp.add(minVal);
                    res.add(tmp);
                    continue;
                }
            }
            if (lef == list.size() - 1) {
                minVal = list.get(lef);
            } else {
                maxVal = list.get(lef + 1);

            }
            List<Integer> tmp = new ArrayList<>();
            tmp.add(minVal);
            tmp.add(maxVal);
            res.add(tmp);
        }
        return res;
    }

    void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        list.add(node.val);
        dfs(node.right);
    }

}
