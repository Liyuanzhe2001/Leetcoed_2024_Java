package com.lyz.code.hikvision;

/**
 * @author lkunk
 * @date 2024年03月08日 15:42
 * @description
 */

public class main_047_重新排列数组 {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        for (int i = 0; i < n; i++) {
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[i + n];
        }
        return res;
    }
}
