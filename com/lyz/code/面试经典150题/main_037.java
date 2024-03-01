package com.lyz.code.面试经典150题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年03月01日 15:04
 * @description
 */

public class main_037 {
    public void setZeroes(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (Integer i : row) {
            Arrays.fill(matrix[i], 0);
        }
        for (Integer i : col) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = 0;
            }
        }
    }
}
