package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年04月12日 16:14
 * @description
 */

public class main_2923 {
    public int findChampion(int[][] grid) {
        int res = 0;
        for (int i = 1; i < grid.length; i++) {
            if (grid[i][res] == 1) {
                res = i;
            }
        }
        return res;
    }
}
