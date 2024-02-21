package com.lyz.code.面试经典150题;

/**
 * @author lkunk
 * @date 2024年02月21日 23:32
 * @description
 */

public class main_008 {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            res = Math.max(res, res + prices[i] - prices[i - 1]);
        }
        return res;
    }
}
