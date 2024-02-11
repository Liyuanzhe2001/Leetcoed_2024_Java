package com.lyz.code.周赛384;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年02月11日 23:21
 * @description
 */

public class main_02 {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int m = pattern.length;
        int n = nums.length;
        int res = 0;
        for (int i = 0; i < n - m; i++) {
            boolean f = true;
            for (int j = i; j < i + m; j++) {
                int a = pattern[j - i];
                int b = nums[j + 1];
                int c = nums[j];
                if ((a == 1 && b <= c) || (a == 0 && b != c) || (a == -1 && b >= c)) {
                    f = false;
                    break;
                }
            }
            if (f) {
                res++;
            }
        }
        return res;
    }
}
