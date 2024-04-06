package com.lyz.code.春招冲刺百题计划_2024;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年04月06日 21:48
 * @description
 */

public class Main_019_轮转数组 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0) {
            return;
        }
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }

}
