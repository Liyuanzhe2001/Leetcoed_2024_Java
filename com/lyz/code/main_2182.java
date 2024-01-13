package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年01月13日 22:42
 * @description
 */

public class main_2182 {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        StringBuilder res = new StringBuilder("");
        int i = 25, j = 24;
        int len = 0;
        while (i >= 0 && j >= 0) {
            if (cnt[i] == 0) {
                i--;
                len = 0;
            } else if (len < repeatLimit) {
                cnt[i]--;
                res.append((char) (i + 'a'));
                len++;
            } else if (j >= i || cnt[j] == 0) {
                j--;
            } else {
                cnt[j]--;
                res.append((char) (j + 'a'));
                len = 0;
            }
        }
        return res.toString();
    }
}
