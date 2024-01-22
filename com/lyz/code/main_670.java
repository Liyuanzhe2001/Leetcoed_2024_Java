package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年01月22日 21:25
 * @description
 */

public class main_670 {
    public int maximumSwap(int num) {
        char[] cs = String.valueOf(num).toCharArray();
        int maxIdx = cs.length - 1;
        int p = -1, q = 0;
        for (int i = cs.length - 2; i >= 0; i--) {
            if (cs[maxIdx] < cs[i]) {
                maxIdx = i;
            } else if (cs[maxIdx] > cs[i]) {
                p = maxIdx;
                q = i;
            }
        }
        if (p == -1) {
            return num;
        }
        char tmp = cs[p];
        cs[p] = cs[q];
        cs[q] = tmp;
        return Integer.parseInt(String.valueOf(cs));
    }
}
