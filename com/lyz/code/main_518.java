package com.lyz.code;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年03月25日 20:38
 * @description
 */

public class main_518 {
    int[] coins;
    int[][] memo;

    public int change(int amount, int[] coins) {
        this.coins = coins;
        int n = coins.length;
        memo = new int[n][amount + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return dfs(n - 1, amount);
    }

    int dfs(int i, int c) {
        if (i < 0) {
            return c == 0 ? 1 : 0;
        }
        if (memo[i][c] != -1) {
            return memo[i][c];
        }
        if (c < coins[i]) {
            return memo[i][c] = dfs(i - 1, c);
        }
        return memo[i][c] = dfs(i - 1, c) + dfs(i, c - coins[i]);
    }
}
