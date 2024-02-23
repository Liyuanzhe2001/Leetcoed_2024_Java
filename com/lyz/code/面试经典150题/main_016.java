package com.lyz.code.面试经典150题;

/**
 * @author lkunk
 * @date 2024年02月23日 20:13
 * @description
 */

public class main_016 {
    public int trap(int[] height) {
        int n = height.length;
        int[] lefMax = new int[n];
        int[] rigMax = new int[n];
        lefMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            lefMax[i] = Math.max(lefMax[i - 1], height[i]);
        }
        rigMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rigMax[i] = Math.max(rigMax[i + 1], height[i]);
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            int min = Math.min(lefMax[i], rigMax[i]);
            res += min - height[i];
        }
        return res;
    }
}
