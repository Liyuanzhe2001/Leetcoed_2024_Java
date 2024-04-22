package com.lyz.code;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年04月22日 23:09
 * @description
 */

public class main_377 {
    public int combinationSum4(int[] nums, int target) {
        int[] memo = new int[target + 1];
        Arrays.fill(memo, -1);
        return dfs(target, nums, memo);
    }

    private int dfs(int i, int[] nums, int[] memo) {
        if (i == 0) {
            return 1;
        }
        if (memo[i] != -1) {
            return memo[i];
        }
        int res = 0;
        for (int x : nums) {
            if (x <= i) {
                res += dfs(i - x, nums, memo);
            }
        }
        return memo[i] = res;
    }
}
