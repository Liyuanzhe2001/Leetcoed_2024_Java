package com.lyz.code.春招冲刺百题计划_2024;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年04月03日 22:31
 * @description
 */

public class Main_001_螺旋矩阵 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0) {
            return res;
        }
        int u = 0;
        int d = matrix.length - 1;
        int l = 0;
        int r = matrix[0].length - 1;

        while (true) {
            for (int i = l; i <= r; ++i) {
                res.add(matrix[u][i]);
            }
            if (++u > d) {
                break;
            }
            for (int i = u; i <= d; ++i) {
                res.add(matrix[i][r]);
            }
            if (--r < l) {
                break;
            }
            for (int i = r; i >= l; --i) {
                res.add(matrix[d][i]);
            }
            if (--d < u) {
                break;
            }
            for (int i = d; i >= u; --i) {
                res.add(matrix[i][l]);
            }
            if (++l > r) {
                break;
            }
        }
        return res;
    }
}
