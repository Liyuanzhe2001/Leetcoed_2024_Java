package com.lyz.code.hikvision;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lkunk
 * @date 2024年03月07日 16:17
 * @description
 */

public class main_023_单词拆分 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>();
        for (String word : wordDict) {
            set.add(word);
        }
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
