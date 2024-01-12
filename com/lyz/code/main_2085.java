package com.lyz.code;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lkunk
 * @date 2024年01月12日 22:47
 * @description
 */

public class main_2085 {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (String s : words1) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }
        for (String s : words2) {
            map1.put(s, map2.getOrDefault(s, 0) + 1);
        }
        int res = 0;
        for (String s : map1.keySet()) {
            if (map1.get(s) == 1 && map2.getOrDefault(s, 0) == 1) {
                res++;
            }
        }
        return res;
    }
}
