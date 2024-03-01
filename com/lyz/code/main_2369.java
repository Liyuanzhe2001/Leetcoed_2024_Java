package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年03月01日 14:34
 * @description
 */

public class main_2369 {
    public boolean validPartition(int[] nums) {
        int n = nums.length;
        boolean[] f = new boolean[n + 1];
        f[0] = true;
        for (int i = 1; i < n; i++) {
            if ((nums[i] == nums[i - 1] && f[i - 1]) ||
                    (i > 1 && f[i - 2] && (
                            (nums[i] == nums[i - 1] && nums[i] == nums[i - 2]) || nums[i] == nums[i - 1] + 1 && nums[i] == nums[i - 2] + 2))) {
                f[i + 1] = true;
            }
        }
        return f[n];
    }
}
