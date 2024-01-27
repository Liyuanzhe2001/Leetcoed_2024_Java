package com.lyz.code;

import java.util.List;

/**
 * @author lkunk
 * @date 2024年01月27日 23:01
 * @description
 */

public class main_2861 {
    public int maxNumberOfAlloys(int n, int k, int budget, List<List<Integer>> composition, List<Integer> stock, List<Integer> cost) {
        int lef = 0;
        int rig = 200000001;
        while (lef <= rig) {
            int mid = (lef + rig) >> 1;
            boolean canBuy = false;
            for (int i = 0; i < k; i++) {
                long sumCost = 0;
                for (int j = 0; j < n; j++) {
                    sumCost += Math.max((long) mid * composition.get(i).get(j) - stock.get(j), 0) * cost.get(j);
                }
                if (sumCost <= budget) {
                    canBuy = true;
                    break;
                }
            }
            if (canBuy) {
                lef = mid + 1;
            } else {
                rig = mid - 1;
            }
        }
        return lef - 1;
    }
}
