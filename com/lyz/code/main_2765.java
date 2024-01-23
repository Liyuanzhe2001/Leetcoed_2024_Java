package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年01月23日 22:21
 * @description
 */

public class main_2765 {
//    public int alternatingSubarray(int[] nums) {
//        int res = 0;
//        int n = nums.length;
//        for (int i = 0; i < n - 1; i++) {
//            int diff = 1;
//            int end = i;
//            while (end + 1 < n && nums[end + 1] - nums[end] == diff) {
//                end++;
//                diff = -diff;
//            }
//            res = Math.max(end - i + 1, res);
//        }
//        return res;
//    }

    public int alternatingSubarray(int[] nums) {
        int res = 0;
        int n = nums.length;
        int i = 0;
        while (i < n - 1) {
            if (nums[i + 1] - nums[i] != 1) {
                i++;
                continue;
            }
            int start = i;
            i += 2;
            while (i < n && nums[i] == nums[i - 2]) {
                i++;
            }
            res = Math.max(res, i - start);
            i--;
        }
        return res;
    }
}
