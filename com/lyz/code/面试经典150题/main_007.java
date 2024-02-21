package com.lyz.code.面试经典150题;

/**
 * @author lkunk
 * @date 2024年02月21日 23:28
 * @description
 */

public class main_007 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int res = 0;
        for (int price : prices) {
            res = Math.max(res, price - min);
            min = Math.min(min, price);
        }
        return res;
    }
}
