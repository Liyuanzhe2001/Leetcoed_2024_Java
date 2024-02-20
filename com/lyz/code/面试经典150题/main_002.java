package com.lyz.code.面试经典150题;

/**
 * @author lkunk
 * @date 2024年02月20日 20:02
 * @description
 */

public class main_002 {
    public int removeElement(int[] nums, int val) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                n++;
            } else {
                nums[i - n] = nums[i];
            }
        }
        return nums.length - n;
    }
}
