package com.lyz.code;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年01月18日 20:54
 * @description
 */

public class main_2171 {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long sum = 0;
        long max = 0;
        int n = beans.length;
        for (int i = 0; i < n; i++) {
            sum += beans[i];
            max = Math.max(max, (long) (n - i) * beans[i]);
        }
        return sum - max;
    }
}
