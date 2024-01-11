package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年01月11日 20:36
 * @description
 */

public class main_2645 {
    public int addMinimum(String word) {
        char[] chars = word.toCharArray();
        int n = chars.length;
        int res = chars[0] - 'a' + 'c' - chars[n - 1];
        for (int i = 1; i < n; i++) {
            res += (chars[i] - chars[i - 1] - 1 + 3) % 3;
        }
        return res;
    }
}
