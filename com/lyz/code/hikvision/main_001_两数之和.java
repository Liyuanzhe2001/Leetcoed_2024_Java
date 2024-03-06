package com.lyz.code.hikvision;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年03月06日 21:08
 * @description
 */

public class main_001_两数之和 {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int lef = 0;
        int rig = nums.length - 1;
        while (lef < rig) {
            int sum = nums[lef] + nums[rig];
            if (sum == target) {
                return new int[]{lef, rig};
            } else if (sum > target) {
                rig--;
            } else {
                lef++;
            }
        }
        return new int[]{};
    }
}
