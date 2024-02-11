package com.lyz.code.周赛384;

/**
 * @author lkunk
 * @date 2024年02月11日 23:50
 * @description
 */

public class main_03 {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int m = pattern.length;
        int[] pi = new int[m];
        int cnt = 0;
        for (int i = 1; i < m; i++) {
            int v = pattern[i];
            while (cnt > 0 && pattern[cnt] != v) {
                cnt = pi[cnt - 1];
            }
            if (pattern[cnt] == v) {
                cnt++;
            }
            pi[i] = cnt;
        }

        int ans = 0;
        cnt = 0;
        for (int i = 1; i < nums.length; i++) {
            int v = Integer.compare(nums[i], nums[i - 1]);
            while (cnt > 0 && pattern[cnt] != v) {
                cnt = pi[cnt - 1];
            }
            if (pattern[cnt] == v) {
                cnt++;
            }
            if (cnt == m) {
                ans++;
                cnt = pi[cnt - 1];
            }
        }
        return ans;
    }
}
