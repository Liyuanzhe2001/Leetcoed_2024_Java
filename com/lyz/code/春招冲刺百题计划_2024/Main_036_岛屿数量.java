package com.lyz.code.春招冲刺百题计划_2024;

/**
 * @author lkunk
 * @date 2024年04月09日 22:55
 * @description
 */

public class Main_036_岛屿数量 {
    char[][] grid;
    int[][] distance = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int numIslands(char[][] grid) {
        this.grid = grid;
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(i, j);
                    res++;
                }
            }
        }
        return res;
    }

    public void dfs(int x, int y) {
        if (x >= grid.length || x < 0 || y >= grid[0].length || y < 0 || grid[x][y] == '0') {
            return;
        }
        grid[x][y] = '0';
        for (int[] ints : distance) {
            dfs(x + ints[0], y + ints[1]);
        }
    }
}
