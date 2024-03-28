package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年03月28日 20:27
 * @description
 */

public class main_1997 {
    public int firstDayBeenInAllRooms(int[] nextVisit) {
        long mod = 1000000007;
        int n = nextVisit.length;
        long[] s = new long[n];
        for (int i = 0; i < n - 1; i++) {
            int j = nextVisit[i];
            s[i + 1] = (s[i] * 2 - s[j] + 2 + mod) % mod;
        }
        return (int) s[n - 1];
    }
}
