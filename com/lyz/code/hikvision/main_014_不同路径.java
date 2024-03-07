package com.lyz.code.hikvision;

/**
 * @author lkunk
 * @date 2024年03月07日 15:01
 * @description
 */

public class main_014_不同路径 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        dp[0][1] = 1;
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m][n];
    }
}
