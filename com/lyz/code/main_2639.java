package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年04月27日 20:07
 * @description
 */

public class main_2639 {
    public int[] findColumnWidth(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i] = Math.max(String.valueOf(grid[j][i]).length(), res[i]);
            }
        }
        return res;
    }
}
