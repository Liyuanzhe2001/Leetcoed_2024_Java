package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年01月17日 19:55
 * @description
 */

public class main_2744 {
    public int maximumNumberOfStringPairs(String[] words) {
        boolean[][] c = new boolean[26][26];
        int res = 0;
        for (String word : words) {
            int c1 = word.charAt(0);
            int c2 = word.charAt(1);
            if (c[c2 - 'a'][c1 - 'a']) {
                res++;
            } else {
                c[c1 - 'a'][c2 - 'a'] = true;
            }
        }
        return res;
    }
}
