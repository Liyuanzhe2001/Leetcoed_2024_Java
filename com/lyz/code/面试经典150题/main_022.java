package com.lyz.code.面试经典150题;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年02月24日 23:33
 * @description
 */

public class main_022 {
    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        StringBuilder relStr = new StringBuilder();
        boolean flag = true;
        String[] str = new String[numRows];
        Arrays.fill(str, "");
        int t = 0;
        for (int i = 0; i < s.length(); i++) {
            str[t] += s.charAt(i);
            if (t == numRows - 1) {
                flag = false;
            } else if (t == 0) {
                flag = true;
            }
            if (flag) {
                t++;
            } else {
                t--;
            }
        }
        for (String value : str) {
            relStr.append(value);
        }
        return relStr.toString();
    }
}
