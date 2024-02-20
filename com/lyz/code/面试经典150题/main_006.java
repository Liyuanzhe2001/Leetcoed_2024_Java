package com.lyz.code.面试经典150题;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年02月20日 20:17
 * @description
 */

public class main_006 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0)
            return;
        int tmpNums1[] = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        int tmpNums2[] = Arrays.copyOf(nums, nums.length - k);
        System.arraycopy(tmpNums1, 0, nums, 0, tmpNums1.length);
        System.arraycopy(tmpNums2, 0, nums, tmpNums1.length, tmpNums2.length);
    }
}
