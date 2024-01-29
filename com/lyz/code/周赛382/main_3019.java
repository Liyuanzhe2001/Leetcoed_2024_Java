package com.lyz.code.周赛382;

/**
 * @author lkunk
 * @date 2024年01月29日 22:13
 * @description
 */

public class main_3019 {
    public int countKeyChanges(String s) {
        char tmp = ' ';
        int res = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (tmp != c) {
                res++;
            }
            tmp = c;
        }
        return res - 1;
    }
}
