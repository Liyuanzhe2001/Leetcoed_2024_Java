package com.lyz.code.hikvision;

/**
 * @author lkunk
 * @date 2024年03月07日 20:30
 * @description
 */

public class main_027_位1的个数 {
    public int hammingWeight(int n) {
        int res = 0;
        for (int i = 0; i <= 31; i++) {
            res += (n >> i) & 1;
        }
        return res;
    }
}
