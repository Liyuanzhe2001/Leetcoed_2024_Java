package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年03月06日 21:02
 * @description
 */

public class main_2917 {
    public int findKOr(int[] nums, int k) {
        int res = 0;
        for (int i = 0; i < 31; i++) {
            int cnt = 0;
            for (int num : nums) {
                if ((num >> i & 1) == 1) {
                    cnt++;
                }
            }
            if (cnt >= k) {
                res += Math.pow(2, i);
            }
        }
        return res;
    }
}
