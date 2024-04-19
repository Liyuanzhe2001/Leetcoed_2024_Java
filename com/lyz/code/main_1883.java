package com.lyz.code;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年04月19日 22:28
 * @description
 */

// TODO 1883. 准时抵达会议现场的最小跳过休息次数
public class main_1883 {
    class Solution {
        public int minSkips(int[] dist, int speed, int hoursBefore) {
            int sumDist = 0;
            for (int d : dist) {
                sumDist += d;
            }
            if (sumDist > (long) speed * hoursBefore) {
                return -1;
            }

            int n = dist.length;
            int[][] memo = new int[n][n];
            for (int[] row : memo) {
                Arrays.fill(row, -1); // -1 表示没有计算过
            }
            for (int i = 0; ; i++) {
                if (dfs(i, n - 2, memo, dist, speed) + dist[n - 1] <= (long) speed * hoursBefore) {
                    return i;
                }
            }
        }

        private int dfs(int i, int j, int[][] memo, int[] dist, int speed) {
            if (j < 0) { // 递归边界
                return 0;
            }
            if (memo[i][j] != -1) { // 之前计算过
                return memo[i][j];
            }
            int res = (dfs(i, j - 1, memo, dist, speed) + dist[j] + speed - 1) / speed * speed;
            if (i > 0) {
                res = Math.min(res, dfs(i - 1, j - 1, memo, dist, speed) + dist[j]);
            }
            return memo[i][j] = res; // 记忆化
        }
    }
}
