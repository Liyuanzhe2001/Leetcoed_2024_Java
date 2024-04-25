package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年04月25日 11:23
 * @description
 */

public class main_2739 {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int res = 0;
        while (mainTank > 0) {
            if (mainTank >= 5) {
                mainTank -= 5;
                if (additionalTank > 0) {
                    mainTank += 1;
                    additionalTank -= 1;
                }
                res += 50;
            } else {
                res += mainTank * 10;
                break;
            }
        }
        return res;
    }
}
