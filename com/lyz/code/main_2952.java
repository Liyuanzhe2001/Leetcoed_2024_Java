package com.lyz.code;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年03月30日 20:11
 * @description
 */

public class main_2952 {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        int s = 1;
        int i = 0;
        int res = 0;
        while (s <= target) {
            if (i < coins.length && coins[i] < s) {
                s += coins[i];
                i++;
            } else {
                s *= 2;
                res++;
            }
        }
        return res;
    }
}
