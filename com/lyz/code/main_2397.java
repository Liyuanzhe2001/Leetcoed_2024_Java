package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年01月04日 23:42
 * @description
 */

public class main_2397 {
    public int maximumRows(int[][] matrix, int numSelect) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] mask = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mask[i] += matrix[i][j] << (n - j - 1);
            }
        }
        int res = 0;
        int cur = 0;
        int limit = (1 << n);
        while (++cur < limit) {
            if (Integer.bitCount(cur) == numSelect) {
                int t = 0;
                for (int j = 0; j < m; j++) {
                    if ((mask[j] & cur) == mask[j]) {
                        ++t;
                    }
                }
                res = Math.max(res, t);
            }
        }
        return res;
    }
}
