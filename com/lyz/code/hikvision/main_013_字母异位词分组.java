package com.lyz.code.hikvision;

import java.util.*;

/**
 * @author lkunk
 * @date 2024年03月07日 14:57
 * @description
 */

public class main_013_字母异位词分组 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            map.compute(new String(chars), (k, v) -> {
                if (v == null) {
                    v = new ArrayList<>();
                }
                v.add(str);
                return v;
            });
        }
        return new ArrayList<>(map.values());
    }
}
