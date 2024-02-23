package com.lyz.code.面试经典150题;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年02月23日 20:34
 * @description
 */

public class main_019 {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        return strs[strs.length - 1].length();
    }
}
