package com.lyz.code.周赛382;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lkunk
 * @date 2024年01月29日 22:14
 * @description
 */

public class main_3020 {
    public int maximumLength(int[] nums) {
        Map<Long, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put((long) num, map.getOrDefault((long) num, 0) + 1);
        }
        int res = 0;
        if (map.containsKey(1L)) {
            res = map.get(1L) % 2 == 0 ? map.get(1L) - 1 : map.get(1L);
        }
        map.remove(1L);
        for (Long key : map.keySet()) {
            int s = 0;
            while (map.getOrDefault(key, 0) >= 2) {
                key *= key;
                s += 2;
            }
            res = Math.max(s + (map.containsKey(key) ? 1 : -1), res);
        }
        return res;
    }
}
