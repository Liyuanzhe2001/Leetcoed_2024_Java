package com.lyz.code.面试经典150题;

/**
 * @author lkunk
 * @date 2024年02月21日 23:42
 * @description
 */

public class main_010 {
    public int jump(int[] nums) {
        int start = 0;
        int end = 1;
        int res = 0;
        while (end < nums.length) {
            int max = 0;
            for (int i = start; i < end; i++) {
                max = Math.max(max, nums[i] + i);
            }
            start = end;
            end = max + 1;
            res++;
        }
        return res;
    }
}
