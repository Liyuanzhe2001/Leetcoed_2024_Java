package com.lyz.code;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lkunk
 * @date 2024年03月27日 17:03
 * @description
 */

public class main_2580 {
    public int countWays(int[][] ranges) {
        Arrays.sort(ranges, Comparator.comparingInt(a -> a[0]));
        int ans = 1;
        int maxR = -1;
        for (int[] p : ranges) {
            if (p[0] > maxR) {
                ans = ans * 2 % 1_000_000_007;
            }
            maxR = Math.max(maxR, p[1]);
        }
        return ans;
    }
}
