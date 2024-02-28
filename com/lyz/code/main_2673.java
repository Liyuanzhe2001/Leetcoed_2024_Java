package com.lyz.code;

import java.util.Map;

/**
 * @author lkunk
 * @date 2024年02月28日 21:40
 * @description
 */

public class main_2673 {
    public int minIncrements(int n, int[] cost) {
        int res = 0;
        for (int i = cost.length - 1; i > 0; i -= 2) {
            res += Math.abs(cost[i] - cost[i - 1]);
            cost[(i - 1) / 2] += Math.max(cost[i], cost[i - 1]);
        }
        return res;
    }
}
