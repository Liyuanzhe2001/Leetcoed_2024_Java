package com.lyz.code.面试经典150题;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年02月22日 23:33
 * @description
 */

public class main_011 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for (int i = 0; i < citations.length; i++) {
            if (n - i < citations[i]) {
                return n - i;
            }
        }
        return 0;
    }
}
