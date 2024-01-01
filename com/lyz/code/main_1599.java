package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年01月01日 15:28
 * @description
 */

public class main_1599 {
    public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        int res = -1;
        int mx = 0, t = 0;
        int wait = 0, i = 0;
        while (wait > 0 || i < customers.length) {
            wait += i < customers.length ? customers[i] : 0;
            int up = Math.min(4, wait);
            wait -= up;
            ++i;
            t += up * boardingCost - runningCost;
            if (t > mx) {
                mx = t;
                res = i;
            }
        }
        return res;
    }
}
