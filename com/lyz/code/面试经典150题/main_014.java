package com.lyz.code.面试经典150题;

/**
 * @author lkunk
 * @date 2024年02月23日 0:06
 * @description
 */

public class main_014 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int i = 0;
        while (i < n) {
            int gg = 0;
            int cnt = 0;
            while (cnt < n) {
                int j = (i + cnt) % n;
                gg += gas[j] - cost[j];
                if (gg < 0) {
                    break;
                }
                cnt++;
            }
            if (cnt == n) {
                return i;
            } else {
                i = i + cnt + 1;
            }
        }
        return -1;
    }
}
