package com.lyz.code.面试经典150题;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年02月22日 23:57
 * @description
 */

public class main_013 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        left[0] = 1;
        int[] right = new int[n];
        right[n - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
            right[n - i - 1] = right[n - i] * nums[n - i];
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        int[] res = new int[n];
        for (int i = 0; i < nums.length; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }
}
