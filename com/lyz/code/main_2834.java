package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年03月08日 17:08
 * @description
 */

public class main_2834 {
    public int minimumPossibleSum(int n, int k) {
        long m = Math.min(k / 2, n);
        return (int) ((m * (m + 1) + (n - m - 1 + k * 2) * (n - m)) / 2 % 1000000007);
    }
}
