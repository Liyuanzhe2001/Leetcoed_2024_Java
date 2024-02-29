package com.lyz.code;

import java.util.*;

/**
 * @author lkunk
 * @date 2024年02月29日 14:29
 * @description
 */

public class main_2581 {

    int res = 0;
    int cnt = 0;
    int k = 0;
    Map<Integer, List<Integer>> map = new HashMap<>();
    Set<Long> set = new HashSet<>();

    public int rootCount(int[][] edges, int[][] guesses, int k) {
        this.k = k;
        for (int[] guess : guesses) {
            set.add((long) guess[0] << 32 | guess[1]);
        }
        for (int[] edge : edges) {
            List<Integer> list = map.getOrDefault(edge[0], new ArrayList<>());
            list.add(edge[1]);
            map.put(edge[0], list);
            list = map.getOrDefault(edge[1], new ArrayList<>());
            list.add(edge[0]);
            map.put(edge[1], list);
        }
        dfs(0, -1);
        reroot(0, -1, cnt);
        return res;
    }

    public void dfs(int index, int father) {
        if (set.contains((long) father << 32 | index)) {
            cnt++;
        }
        List<Integer> list = map.get(index);
        for (Integer v : list) {
            if (v != father) {
                dfs(v, index);
            }
        }
    }

    private void reroot(int x, int fa, int count) {
        if (count >= k) {
            res++;
        }
        for (int y : map.get(x)) {
            if (y != fa) {
                int c = count;
                if (set.contains((long) x << 32 | y)) {
                    c--;
                }
                if (set.contains((long) y << 32 | x)) {
                    c++;
                }
                reroot(y, x, c);
            }
        }
    }

}
