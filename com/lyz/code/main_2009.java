package com.lyz.code;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年04月08日 20:29
 * @description
 */

public class main_2009 {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int m = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[m++] = nums[i];
            }
        }
        int res = 0;
        int lef = 0;
        for (int i = 0; i < m; i++) {
            while (nums[lef] < nums[i] - n + 1) {
                lef++;
            }
            res = Math.max(res, i - lef + 1);
        }
        return n - res;
    }
}
