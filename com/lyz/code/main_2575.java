package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年03月07日 20:12
 * @description
 */

public class main_2575 {
    public int[] divisibilityArray(String word, int m) {
        int n = word.length();
        int[] res = new int[n];
        longg sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (sum * 10 + word.charAt(i) - '0') % m;
            if (sum == 0) {
                res[i] = 1;
            }
        }
        return res;
    }
}
