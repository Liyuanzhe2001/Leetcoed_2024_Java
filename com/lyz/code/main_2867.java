package com.lyz.code;

import java.net.Inet4Address;
import java.util.*;

/**
 * @author lkunk
 * @date 2024年02月27日 16:30
 * @description
 */

public class main_2867 {
    boolean[] np;

    public long countPaths(int n, int[][] edges) {
        np = new boolean[n + 1];
        np[1] = true;
        for (int i = 2; i * i <= n; i++) {
            if (!np[i]) {
                for (int j = i * i; j <= n; j += i) {
                    np[j] = true;
                }
            }
        }

        List<Integer>[] g = new ArrayList[n + 1];
        Arrays.setAll(g, e -> new ArrayList<>());
        for (var e : edges) {
            int x = e[0], y = e[1];
            g[x].add(y);
            g[y].add(x);
        }

        long ans = 0;
        int[] size = new int[n + 1];
        var nodes = new ArrayList<Integer>();
        for (int x = 1; x <= n; x++) {
            if (np[x]) {
                continue;
            }
            int sum = 0;
            for (int y : g[x]) {
                if (!np[y]) {
                    continue;
                }
                if (size[y] == 0) {
                    nodes.clear();
                    dfs(y, -1, g, nodes);
                    for (int z : nodes) {
                        size[z] = nodes.size();
                    }
                }
                ans += (long) size[y] * sum;
                sum += size[y];
            }
            ans += sum;
        }
        return ans;
    }

    private void dfs(int x, int fa, List<Integer>[] g, List<Integer> nodes) {
        nodes.add(x);
        for (int y : g[x]) {
            if (y != fa && np[y]) {
                dfs(y, x, g, nodes);
            }
        }
    }

}
