package com.lyz.code;

import java.util.*;

/**
 * @author lkunk
 * @date 2024年02月02日 16:10
 * @description
 */

public class main_1686 {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        int n = aliceValues.length;
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new int[]{aliceValues[i] + bobValues[i], i});
        }
        list.sort((o1, o2) -> o2[0] - o1[0]);
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                a += aliceValues[list.get(i)[1]];
            } else {
                b += bobValues[list.get(i)[1]];
            }
        }
        if (a > b) {
            return 1;
        } else if (a < b) {
            return -1;
        } else {
            return 0;
        }
    }
}
