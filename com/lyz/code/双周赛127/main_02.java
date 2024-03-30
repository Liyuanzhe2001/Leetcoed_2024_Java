package com.lyz.code.双周赛127;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年03月30日 22:26
 * @description
 */

public class main_02 {
    public static void main(String[] args) {
        int[] possible = new int[]{1, 0, 1, 0};
        new main_02().minimumLevels(possible);
    }

    public int minimumLevels(int[] possible) {
        int n = possible.length;
        int[] pre = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            pre[i] = pre[i - 1] + (possible[i - 1] == 0 ? -1 : 1);
        }
        for (int i = 1; i < n; i++) {
            if (pre[i] > pre[n] - pre[i]) {
                return i;
            }
        }
//        System.out.println(Arrays.toString(pre));
        return -1;
    }
}
