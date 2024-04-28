package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年04月28日 20:22
 * @description
 */

public class main_1017 {
    public String baseNeg2(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder res = new StringBuilder();
        while (Math.abs(n) > 0) {
            int tmp = Math.abs(n % (-2));
            res.insert(0, (tmp == 0 ? "0" : "1"));
            n = (n - tmp) / (-2);
        }
        return res.toString();
    }
}
