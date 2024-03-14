package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年03月14日 20:36
 * @description
 */

public class main_2789 {
    public long maxArrayValue(int[] nums) {
        int n = nums.length;
        long res = nums[n - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            res = res >= nums[i] ? res + nums[i] : nums[i];
        }
        return res;
    }
}
