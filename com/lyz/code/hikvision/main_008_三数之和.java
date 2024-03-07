package com.lyz.code.hikvision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年03月07日 10:56
 * @description
 */

public class main_008_三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums.length < 3) {
            return lists;
        }
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int lef = i + 1;
            int rig = n - 1;
            while (lef < rig) {
                int sum = nums[lef] + nums[rig] + nums[i];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[lef]);
                    list.add(nums[rig]);
                    list.add(nums[i]);
                    lists.add(list);
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
        return lists;
    }
}
