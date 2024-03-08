package com.lyz.code.hikvision;

/**
 * @author lkunk
 * @date 2024年03月08日 11:59
 * @description
 */

public class main_037_最长回文串 {
    public int longestPalindrome(String s) {
        int[] cnt = new int[128];
        for (char c : s.toCharArray()) {
            cnt[c]++;
        }
        int res = 0;
        int add = 0;
        for (int i : cnt) {
            res += i / 2 * 2;
            if (i % 2 == 1) {
                add = 1;
            }
        }
        return res + add;
    }
}
