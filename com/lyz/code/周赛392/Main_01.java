package com.lyz.code.周赛392;

/**
 * @author lkunk
 * @date 2024年04月07日 10:26
 * @description
 */

public class Main_01 {
    public int longestMonotonicSubarray(int[] nums) {
        int a = 1;
        int b = 1;
        int tmpA = 1;
        int tmpB = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                tmpA++;
            } else {
                a = Math.max(a, tmpA);
                tmpA = 1;
            }
        }
        a = Math.max(a, tmpA);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                tmpB++;
            } else {
                b = Math.max(b, tmpB);
                tmpB = 1;
            }
        }
        b = Math.max(b, tmpB);
        return Math.max(a, b);
    }
}
