package com.lyz.code.春招冲刺百题计划_2024;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lkunk
 * @date 2024年04月06日 22:20
 * @description
 */

public class Main_023_存在重复元素II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
