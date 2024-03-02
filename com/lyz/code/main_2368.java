package com.lyz.code;

import java.util.*;

/**
 * @author lkunk
 * @date 2024年03月02日 23:15
 * @description
 */

public class main_2368 {
    int res = 0;

    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            List<Integer> list1 = map.getOrDefault(edge[0], new ArrayList<>());
            list1.add(edge[1]);
            map.put(edge[0], list1);
            List<Integer> list2 = map.getOrDefault(edge[1], new ArrayList<>());
            list2.add(edge[0]);
            map.put(edge[1], list2);
        }
        boolean[] f = new boolean[n];
        for (int i : restricted) {
            f[i] = true;
        }
        if (f[0]) {
            return 0;
        } else {
            dfs(f, map, 0, -1);
            return res;
        }
    }

    void dfs(boolean[] f, Map<Integer, List<Integer>> map, int idx, int fa) {
        res++;
        for (Integer v : map.getOrDefault(idx, new ArrayList<>())) {
            if (v != fa && !f[v]) {
                dfs(f, map, v, idx);
            }
        }
    }
g}
