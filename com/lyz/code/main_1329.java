package com.lyz.code;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.*;

/**
 * @author lkunk
 * @date 2024年04月29日 23:36
 * @description
 */

public class main_1329 {
    public int[][] diagonalSort(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        List<Queue<Integer>> list = new ArrayList<>();
        for (int i = 0; i < m + n; i++) {
            list.add(new PriorityQueue<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                list.get(i - j + m).add(mat[i][j]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = list.get(i - j + m).poll();
            }
        }
        return mat;
    }
}
