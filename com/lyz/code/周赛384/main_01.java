package com.lyz.code.周赛384;

/**
 * @author lkunk
 * @date 2024年02月11日 23:15
 * @description
 */

public class main_01 {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] max = new int[n];
        for (int i = 0; i < n; i++) {
            int maxV = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                maxV = Math.max(maxV, matrix[j][i]);
            }
            max[i] = maxV;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = max[j];
                }
            }
        }
        return matrix;
    }
}
