package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年04月23日 21:49
 * @description
 */

public class main_1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int res = 0;
        int n = customers.length;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                res += customers[i];
            }
        }
        int add = 0;
        for (int i = 0; i < minutes; i++) {
            add += customers[i] * grumpy[i];
        }
        int maxAdd = add;
        for (int i = minutes; i < n; i++) {
            add = add - customers[i - minutes] * grumpy[i - minutes] + customers[i] * grumpy[i];
            maxAdd = Math.max(maxAdd, add);
        }
        return res + maxAdd;
    }
}
