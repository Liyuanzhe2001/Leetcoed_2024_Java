package com.lyz.code.面试经典150题;

/**
 * @author lkunk
 * @date 2024年02月21日 23:36
 * @description
 */

public class main_009 {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max >= i) {
                max = Math.max(max, nums[i] + i);
            } else {
                return false;
            }
        }
        return true;
    }
}
