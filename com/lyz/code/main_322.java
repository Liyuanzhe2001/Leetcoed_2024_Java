package com.lyz.code;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年03月24日 21:42
 * @description
 */

public class main_322 {
    private int[] coins;
    private int[][] memo;

    public int coinChange(int[] coins, int amount) {
        this.coins = coins;
        int n = coins.length;
        memo = new int[n][amount + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        int ans = dfs(n - 1, amount);
        return ans < Integer.MAX_VALUE / 2 ? ans : -1;
    }

    private int dfs(int i, int c) {
        if (i < 0) {
            return c == 0 ? 0 : Integer.MAX_VALUE / 2;
        }
        if (memo[i][c] != -1) {
            return memo[i][c];
        }
        if (c < coins[i]) {
            return memo[i][c] = dfs(i - 1, c);
        }
        return memo[i][c] = Math.min(dfs(i - 1, c), dfs(i, c - coins[i]) + 1);
    }
}
