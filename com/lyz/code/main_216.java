package com.lyz.code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年04月21日 23:14
 * @description
 */

public class main_216 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(1, new ArrayList<>(), n, k);
        return res;
    }

    public void dfs(int i, List<Integer> list, int n, int k) {
        if (k == 0 && n == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        if (i >= 10 || k <= 0 || n <= 0) {
            return;
        }
        dfs(i + 1, list, n, k);
        list.add(i);
        dfs(i + 1, list, n - i, k - 1);
        list.remove(list.size() - 1);
    }

}
