package com.lyz.code;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年01月16日 20:20
 * @description
 */

public class main_2719 {

    public final int MOD = 1000000007;

    public int count(String num1, String num2, int min_sum, int max_sum) {
        int ans = calc(num2, min_sum, max_sum) - calc(num1, min_sum, max_sum) + MOD; // 避免负数
        int sum = 0;
        for (char c : num1.toCharArray()) {
            sum += c - '0';
        }
        if (min_sum <= sum && sum <= max_sum) {
            ans++; // num1 是合法的，补回来
        }
        return ans % MOD;
    }

    public int calc(String s, int minSum, int maxSum) {
        int n = s.length();
        int[][] dp = new int[n][Math.min(9 * n, maxSum) + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return dfs(0, 0, true, s.toCharArray(), minSum, maxSum, dp);
    }

    public int dfs(int i, int sum, boolean isLimit, char[] s, int minSum, int maxSum, int[][] dp) {
        if (sum > maxSum) {
            return 0;
        }
        if (i == s.length) {
            return sum >= minSum ? 1 : 0;
        }
        if (!isLimit && dp[i][sum] != -1) {
            return dp[i][sum];
        }
        int up = isLimit ? s[i] - '0' : 9;
        int res = 0;
        for (int d = 0; d <= up; d++) {
            res = (res + dfs(i + 1, sum + d, isLimit && (d == up), s, minSum, maxSum, dp)) % MOD;
        }
        if (!isLimit) {
            dp[i][sum] = res;
        }
        return res;
    }
}
