package com.lyz.code;

import java.util.Set;

/**
 * @author lkunk
 * @date 2024年01月09日 23:22
 * @description
 */

public class main_2707 {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> set = Set.of(dictionary);
        int[] dp = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            dp[i + 1] = Integer.MAX_VALUE;
            for (int j = 0; j <= i; j++) {
                dp[i + 1] = Math.min(dp[i + 1], dp[j] + (set.contains(s.substring(j, i + 1)) ? 0 : i - j + 1));
            }
        }
        return dp[s.length()];
    }
}
