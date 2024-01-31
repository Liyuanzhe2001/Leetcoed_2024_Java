package com.lyz.code;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lkunk
 * @date 2024年01月31日 19:54
 * @description
 */

public class main_2670 {
    public int[] distinctDifferenceArray(int[] nums) {
        Set<Integer> pref = new HashSet<>();
        Set<Integer> last = new HashSet<>();
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < nums.length; i++) {
            pref.add(nums[i]);
            res[n - 1 - i] -= last.size();
            last.add(nums[n - 1 - i]);
            res[i] += pref.size();
        }
        return res;
    }
}
