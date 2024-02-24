package com.lyz.code.面试经典150题;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年02月24日 23:28
 * @description
 */

public class main_021 {
    public String reverseWords(String s) {
        String[] strs = s.trim().split("\\s+");
        for (int lef = 0, rig = strs.length - 1; lef < rig; lef++, rig--) {
            String tmp = strs[lef];
            strs[lef] = strs[rig];
            strs[rig] = tmp;
        }
        System.out.println(Arrays.toString(strs));
        return String.join(" ", strs);
    }
}
