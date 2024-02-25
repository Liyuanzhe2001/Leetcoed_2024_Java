package com.lyz.code.面试经典150题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年02月25日 16:38
 * @description
 */

public class main_029 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > 0) {
                return res;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int lef = i + 1;
            int rig = nums.length - 1;
            while (lef < rig) {
                int sum = nums[i] + nums[lef] + nums[rig];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[lef]);
                    list.add(nums[rig]);
                    res.add(list);
                    while (lef < rig && nums[lef] == nums[lef + 1]) {
                        lef++;
                    }
                    while (lef < rig && nums[rig] == nums[rig - 1]) {
                        rig--;
                    }
                    lef++;
                    rig--;
                } else if (sum > 0) {
                    rig--;
                } else {
                    lef++;
                }
            }
        }
        return res;
    }
}
