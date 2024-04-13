package com.lyz.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lkunk
 * @date 2024年04月13日 20:30
 * @description
 */

public class main_2924 {

    public int findChampion(int n, int[][] edges) {
        boolean[] defeat = new boolean[n];
        for (int[] edge : edges) {
            defeat[edge[1]] = true;
        }
        int res = -1;
        for (int i = 0; i < n; i++) {
            if (!defeat[i]) {
                if (res != -1) {
                    return -1;
                }
                res = i;
            }
        }
        return res;
    }

}
