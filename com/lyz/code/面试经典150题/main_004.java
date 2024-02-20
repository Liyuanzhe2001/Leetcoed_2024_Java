package com.lyz.code.面试经典150题;

/**
 * @author lkunk
 * @date 2024年02月20日 20:09
 * @description
 */

public class main_004 {
    public int removeDuplicates(int[] nums) {
        int n = 0;
        int lef = 0, rig = 0, v = nums[0];
        while (rig < nums.length) {
            if (nums[rig] != v) {
                v = nums[rig];
                lef = rig;
            }
            if (rig - lef > 1) {
                n++;
            } else {
                nums[rig - n] = v;
            }
            rig++;
        }
        return nums.length - n;
    }
}
