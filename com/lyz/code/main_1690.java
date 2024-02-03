package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年02月03日 22:41
 * @description
 */

public class main_1690 {
    public int stoneGameVII(int[] stones) {
        int n = stones.length;
        int[] sum = new int[n + 1];
        int[][] memo = new int[n][n];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + stones[i];
        }
        return dfs(0, n - 1, sum, memo);
    }

    int dfs(int lef, int rig, int sum[], int[][] memo) {
        if (lef >= rig) {
            return 0;
        }
        if (memo[lef][rig] != 0) {
            return memo[lef][rig];
        }
        int res = Math.max(sum[rig + 1] - sum[lef + 1] - dfs(lef + 1, rig, sum, memo), sum[rig] - sum[lef] - dfs(lef, rig - 1, sum, memo));
        memo[lef][rig] = res;
        return res;
    }

}
