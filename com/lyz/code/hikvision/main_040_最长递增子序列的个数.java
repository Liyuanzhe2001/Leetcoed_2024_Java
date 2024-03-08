package com.lyz.code.hikvision;

/**
 * @author lkunk
 * @date 2024年03月08日 14:19
 * @description
 */

public class main_040_最长递增子序列的个数 {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] cnt = new int[n];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            cnt[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                        cnt[i] = cnt[j];
                    } else if (dp[i] == dp[j] + 1) {
                        cnt[i] += cnt[j];
                    }
                }
            }
            max = Math.max(dp[i], max);
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == max) {
                res += cnt[i];
            }
        }
        return res;
    }
}
