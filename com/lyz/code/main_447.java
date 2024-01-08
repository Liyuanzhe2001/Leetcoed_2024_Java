package com.lyz.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lkunk
 * @date 2024年01月08日 23:32
 * @description
 */

public class main_447 {
    public int numberOfBoomerangs(int[][] points) {
        int n = points.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int len = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    len = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0]) + (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
                    map.put(len, map.getOrDefault(len, 0) + 1);
                }
            }
            for (Integer value : map.values()) {
                res += value * (value - 1);
            }
        }
        return res;
    }
}
