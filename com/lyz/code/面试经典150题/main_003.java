package com.lyz.code.面试经典150题;

/**
 * @author lkunk
 * @date 2024年02月20日 20:07
 * @description
 */

public class main_003 {
    public int removeDuplicates(int[] nums) {
        int n = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                n++;
            } else {
                nums[i - n] = nums[i];
            }
        }
        return nums.length - n;
    }
}
