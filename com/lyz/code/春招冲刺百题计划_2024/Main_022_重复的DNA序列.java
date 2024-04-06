package com.lyz.code.春招冲刺百题计划_2024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lkunk
 * @date 2024年04月06日 22:09
 * @description
 */

public class Main_022_重复的DNA序列 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() <= 10) {
            return res;
        }
        Map<String, Integer> map = new HashMap<>();
        for (int i = 10; i <= s.length(); i++) {
            String str = s.substring(i - 10, i);
            Integer nn = map.getOrDefault(str, 0);
            if (nn == 1) {
                res.add(str);
            }
            map.put(str, nn + 1);
        }
        return res;
    }
}
