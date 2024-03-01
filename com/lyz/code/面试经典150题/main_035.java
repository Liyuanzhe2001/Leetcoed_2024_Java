package com.lyz.code.面试经典150题;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年03月01日 14:46
 * @description
 */

public class main_035 {

    int[][] distance = new int[][]{
            {0, 1}, {1, 0}, {0, -1}, {-1, 0}
    };
    int g = 0;
    List<Integer> res = new ArrayList<>();

    public List<Integer> spiralOrder(int[][] matrix) {
        f(0, 0, matrix, new boolean[matrix.length][matrix[0].length]);
        return res;
    }

    public void f(int x, int y, int[][] matrix, boolean[][] visited) {
        if (res.size() == matrix.length * matrix[0].length) {
            return;
        }
        visited[x][y] = true;
        res.add(matrix[x][y]);
        int targetX = x + distance[g % 4][0];
        int targetY = y + distance[g % 4][1];
        if (targetX < 0 || targetX >= matrix.length || targetY < 0 || targetY >= matrix[0].length || visited[targetX][targetY]) {
            g++;
        }
        f(x + distance[g % 4][0], y + distance[g % 4][1], matrix, visited);
    }

}
