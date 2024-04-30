package com.lyz.code;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author lkunk
 * @date 2024年04月30日 20:32
 * @description
 */

public class main_2798 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int res = 0;
        for (int hour : hours) {
            if (hour >= target) {
                res++;
            }
        }
        return res;
    }
}
