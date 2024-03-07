package com.lyz.code.hikvision;

import java.util.*;

/**
 * @author lkunk
 * @date 2024年03月07日 16:06
 * @description
 */

public class main_022_最长连续序列 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int res = 0;
        for (Integer num : set) {
            int cnt = 0;
            if (!set.contains(num - 1)) {
                while (set.contains(num)) {
                    num++;
                    cnt++;
                }
                res = Math.max(cnt, res);
            }
        }
        return res;
    }
}
