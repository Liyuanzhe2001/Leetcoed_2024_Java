package com.lyz.code.hikvision;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年03月08日 14:01
 * @description
 */

public class main_038_最长回文子序列 {
    int[][] memo;
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        memo = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1);
        }
        return dfs(s.toCharArray(), 0, n - 1);
    }

    int dfs(char[] chars, int i, int j) {
        if (i > j) {
            return 0;
        }
        if (i == j) {
            return 1;
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        if (chars[i] == chars[j]) {
            return memo[i][j] = dfs(chars, i + 1, j - 1) + 2;
        } else {
            return memo[i][j] = Math.max(dfs(chars, i, j - 1), dfs(chars, i + 1, j));
        }
    }

}
