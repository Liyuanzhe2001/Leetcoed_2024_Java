package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年03月20日 19:40
 * @description
 */

public class main_1969 {
    final int MOD = 1000000007;

    public long fastPow(long x, int p) {
        x %= MOD;
        long res = 1;
        while (p-- > 0) {
            res = (res * x) % MOD;
            x = x * x % MOD;
        }
        return res;
    }

    public int minNonZeroProduct(int p) {
        long k = (1L << p) - 1;
        return (int) (k % MOD * fastPow(k - 1, p - 1) % MOD);
    }
}
