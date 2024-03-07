package com.lyz.code.hikvision;

/**
 * @author lkunk
 * @date 2024年03月07日 11:16
 * @description
 */

public class main_011_接雨水 {
    public int trap(int[] height) {
        int n = height.length;
        int[] lefMax = new int[n];
        int[] rigMax = new int[n];
        lefMax[0] = height[0];
        rigMax[n - 1] = height[n - 1];
        for (int i = 1; i < n; i++) {
            lefMax[i] = Math.max(height[i], lefMax[i - 1]);
            rigMax[n - 1 - i] = Math.max(height[n - 1 - i], rigMax[n - i]);
        }
        int res = 0;
        for (int i = 1; i < n; i++) {
            int min = Math.min(lefMax[i], rigMax[i]);
            res += min - height[i];
        }
        return res;
    }
}
