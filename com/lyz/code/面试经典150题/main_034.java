package com.lyz.code.面试经典150题;

/**
 * @author lkunk
 * @date 2024年02月26日 14:18
 * @description
 */

public class main_034 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[9];
            boolean[] col = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!row[board[i][j] - '1']) {
                        row[board[i][j] - '1'] = true;
                    } else {
                        return false;
                    }
                }
                if (board[j][i] != '.') {
                    if (!col[board[j][i] - '1']) {
                        col[board[j][i] - '1'] = true;
                    } else {
                        return false;
                    }
                }
                if (i % 3 == 0 && j % 3 == 0) {
                    if (!cal(board, i, j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean cal(char[][] board, int x, int y) {
        boolean[] flag = new boolean[9];
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (!flag[board[i][j] - '1']) {
                    flag[board[i][j] - '1'] = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
