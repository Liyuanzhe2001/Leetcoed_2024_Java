package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年03月19日 21:25
 * @description
 */

public class main_1793 {
    public int maximumScore(int[] nums, int k) {
        int n = nums.length;
        int res = nums[k];
        int minH = nums[k];
        int i = k;
        int j = k;
        for (int t = 0; t < n - 1; t++) {
            if (j == n - 1 || i > 0 && nums[i - 1] > nums[j + 1]) {
                minH = Math.min(minH, nums[--i]);
            } else {
                minH = Math.min(minH, nums[++j]);
            }
            res = Math.max(res, minH * (j - i + 1));
        }
        return res;
    }
}
