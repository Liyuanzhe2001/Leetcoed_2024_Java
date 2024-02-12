package com.lyz.code.周赛383;

/**
 * @author lkunk
 * @date 2024年02月12日 23:15
 * @description
 */

public class main_01 {
    public int returnToBoundaryCount(int[] nums) {
        int now = 0;
        int res = 0;
        for (int num : nums) {
            now += num;
            if (now == 0) {
                res++;
            }
        }
        return res;
    }
}
