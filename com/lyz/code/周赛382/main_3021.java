package com.lyz.code.周赛382;

/**
 * @author lkunk
 * @date 2024年01月29日 22:36
 * @description
 */

public class main_3021 {
    public long flowerGame(int n, int m) {
        long cnt1 = 0, cnt2 = 0;
        for (int i = 1; i <= n; i++) {
            cnt1 += i % 2 ^ 1;
        }
        for (int i = 1; i <= m; i++) {
            cnt2 += i % 2 ^ 1;
        }
        return cnt1 * (m - cnt2) + cnt2 * (n - cnt1);
    }
}
