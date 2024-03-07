package com.lyz.code.hikvision;

/**
 * @author lkunk
 * @date 2024年03月07日 16:03
 * @description
 */

public class main_021_买卖股票的最佳时机II {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            res = Math.max(res, res + prices[i] - prices[i - 1]);
        }
        return res;
    }
}
