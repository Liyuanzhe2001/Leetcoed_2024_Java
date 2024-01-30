package com.lyz.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lkunk
 * @date 2024年01月30日 22:59
 * @description
 */

public class main_2808 {
    public int minimumSeconds(List<Integer> nums) {
        int n = nums.size();
        Map<Integer, List<Integer>> map = new HashMap();
        for (int i = 0; i < n; i++) {
            List<Integer> list = map.getOrDefault(nums.get(i), new ArrayList<>());
            list.add(i);
            map.put(nums.get(i), list);
        }
        int res = Integer.MAX_VALUE;
        for (List<Integer> list : map.values()) {
            int max = list.get(0) - list.get(list.size() - 1) + n;
            for (int i = 1; i < list.size(); i++) {
                max = Math.max(list.get(i) - list.get(i - 1), max);
            }
            res = Math.min(res, max / 2);
        }
        return res;
    }
}
