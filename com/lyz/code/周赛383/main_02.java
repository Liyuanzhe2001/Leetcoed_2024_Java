package com.lyz.code.周赛383;

/**
 * @author lkunk
 * @date 2024年02月12日 23:17
 * @description
 */

public class main_02 {
    public int minimumTimeToInitialState(String word, int k) {
        int n = word.length();
        int i = 1;
        while (i * k < n) {
            if (word.substring(i * k).equals(word.substring(0, n - i * k))) {
                return i;
            }
            i++;
        }
        return i;
    }
}
