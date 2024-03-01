package com.lyz.code.面试经典150题;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author lkunk
 * @date 2024年03月01日 16:29
 * @description
 */

public class main_040 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map1.containsKey(c1) && map2.containsKey(c2)) {
                if (map1.get(c1) != c2 || map2.get(c2) != c1) {
                    return false;
                }
            } else if (!map1.containsKey(c1) && !map2.containsKey(c2)) {
                map1.put(c1, c2);
                map2.put(c2, c1);
            } else {
                return false;
            }
        }
        return true;
    }
}
