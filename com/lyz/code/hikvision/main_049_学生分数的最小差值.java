package com.lyz.code.hikvision;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年03月08日 15:53
 * @description
 */

public class main_049_学生分数的最小差值 {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if (nums.length == k) {
            return nums[k - 1] - nums[0];
        }
        int c = Integer.MAX_VALUE;
        for (int i = 0, j = k; j < nums.length; j++, i++) {
            c = Math.min(c, nums[j] - nums[i]);
        }
        return c;
    }
}
