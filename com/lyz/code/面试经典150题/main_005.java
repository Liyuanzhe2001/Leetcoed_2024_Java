package com.lyz.code.面试经典150题;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lkunk
 * @date 2024年02月20日 20:15
 * @description
 */

public class main_005 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int mid = nums.length >> 1;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > mid) {
                return num;
            }
        }
        return -1;
    }
}
