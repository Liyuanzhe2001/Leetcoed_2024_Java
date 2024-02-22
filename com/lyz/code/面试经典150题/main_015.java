package com.lyz.code.面试经典150题;

/**
 * @author lkunk
 * @date 2024年02月23日 0:17
 * @description
 */

public class main_015 {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int res = n;
        for (int i = 1; i < n; i++) {
            if (ratings[i - 1] < ratings[i]) {
                left[i] += left[i - 1] + 1;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] += right[i + 1] + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            res += Math.max(left[i], right[i]);
        }
        return res;
    }
}
