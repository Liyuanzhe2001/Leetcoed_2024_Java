package com.lyz.code.面试经典150题;

/**
 * @author lkunk
 * @date 2024年02月25日 16:48
 * @description
 */

public class main_030 {
    public int minSubArrayLen(int target, int[] nums) {
        int lef = 0;
        int rig = 0;
        int n = nums.length;
        int res = n + 1;
        int sum = 0;
        while (rig < n) {
            sum += nums[rig];
            while (sum >= target) {
                res = Math.min(rig - lef + 1, res);
                sum -= nums[lef];
                lef++;
            }
            rig++;
        }
        return res == n + 1 ? 0 : res;
    }
}
