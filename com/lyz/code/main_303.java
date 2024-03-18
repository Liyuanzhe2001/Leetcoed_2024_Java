package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年03月18日 21:20
 * @description
 */

public class main_303 {
    class NumArray {
        int[] sum;

        public NumArray(int[] nums) {
            int n = nums.length;
            sum = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                sum[i] = sum[i - 1] + nums[i - 1];
            }
        }

        public int sumRange(int left, int right) {
            return sum[right + 1] - sum[left];
        }
    }
}
