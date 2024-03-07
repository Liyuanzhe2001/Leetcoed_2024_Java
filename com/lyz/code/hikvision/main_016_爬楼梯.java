package com.lyz.code.hikvision;

/**
 * @author lkunk
 * @date 2024年03月07日 15:13
 * @description
 */

public class main_016_爬楼梯 {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int ppre = 1;
        int pre = 2;
        for (int i = 2; i < n; i++) {
            int tmp = ppre + pre;
            ppre = pre;
            pre = tmp;
        }
        return pre;
    }
}
