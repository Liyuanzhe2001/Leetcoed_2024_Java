package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年03月29日 16:06
 * @description
 */

public class main_2908 {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int[] suf = new int[n];
        suf[n - 1] = nums[n - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            suf[i] = Math.min(suf[i + 1], nums[i]);
        }
        int res = Integer.MAX_VALUE;
        int pre = nums[0];
        for (int i = 1; i < n - 1; i++) {
            if (pre < nums[i] && nums[i] > suf[i + 1]) {
                res = Math.min(res, pre + nums[i] + suf[i + 1]);
            }
            pre = Math.min(pre, nums[i]);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
