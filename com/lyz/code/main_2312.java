package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年03月15日 13:39
 * @description
 */

public class main_2312 {
    public long sellingWood(int m, int n, int[][] prices) {
        int[][] pr = new int[m + 1][n + 1];
        for (int[] p : prices) {
            pr[p[0]][p[1]] = p[2];
        }

        long[][] f = new long[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                f[i][j] = pr[i][j];
                for (int k = 1; k < j; k++) {
                    f[i][j] = Math.max(f[i][j], f[i][k] + f[i][j - k]); // 垂直切割
                }
                for (int k = 1; k < i; k++) {
                    f[i][j] = Math.max(f[i][j], f[k][j] + f[i - k][j]); // 水平切割
                }
            }
        }
        return f[m][n];
    }

}
