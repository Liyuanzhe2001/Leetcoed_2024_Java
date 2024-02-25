package com.lyz.code.面试经典150题;

/**
 * @author lkunk
 * @date 2024年02月25日 16:30
 * @description
 */

public class main_028 {
    public int maxArea(int[] height) {
        int lef = 0;
        int rig = height.length - 1;
        int res = 0;
        while (lef < rig) {
            res = Math.max(res, (rig - lef) * Math.min(height[lef], height[rig]));
            if (height[lef] < height[rig]) {
                lef++;
            } else {
                rig--;
            }
        }
        return res;
    }
}
