package com.lyz.code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年04月04日 22:00
 * @description
 */

public class main_2192 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer>[] r;

    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        r = new List[n];
        for (int i = 0; i < n; i++) {
            res.add(new ArrayList<>());
            r[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            r[edge[0]].add(edge[1]);
        }
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n];
            visited[i] = true;
            dfs(i, i, visited);
        }
        return res;
    }

    public void dfs(int v, int i, boolean[] visited) {
        for (Integer t : r[i]) {
            if (!visited[t]) {
                visited[t] = true;
                res.get(t).add(v);
                dfs(v, t, visited);
            }
        }
    }

}
