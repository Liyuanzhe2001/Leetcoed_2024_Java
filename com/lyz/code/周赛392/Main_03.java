package com.lyz.code.周赛392;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年04月07日 10:26
 * @description
 */

public class Main_03 {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int minIdx = n / 2;

        if (nums[minIdx] == k) {
            return 0;
        }
        long res = 0;
        int lefIdx = minIdx;
        int rigIdx = minIdx;
        while (lefIdx >= 0) {
            if (nums[lefIdx] > k) {
                res = res + nums[lefIdx] - k;
                lefIdx--;
            } else {
                break;
            }
        }
        while (rigIdx < nums.length) {
            if (nums[rigIdx] < k) {
                res = res + k - nums[rigIdx];
                rigIdx++;
            } else {
                break;
            }
        }
        return res;
    }
}
