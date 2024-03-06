package com.lyz.code.hikvision;

/**
 * @author lkunk
 * @date 2024年03月06日 22:48
 * @description
 */

public class main_004_最长回文子串 {
    public String longestPalindrome(String s) {
        int n = s.length();
        String res = String.valueOf(s.charAt(0));
        for (int i = 1; i < n; i++) {
            int lef = i - 1;
            int rig = i + 1;
            while (lef >= 0 && s.charAt(lef) == s.charAt(i)) {
                lef--;
            }
            while (rig < n && s.charAt(rig) == s.charAt(i)) {
                rig++;
            }
            while (lef >= 0 && rig < n && s.charAt(lef) == s.charAt(rig)) {
                lef--;
                rig++;
            }
            if (res.length() < rig - lef - 1) {
                res = s.substring(lef + 1, rig);
            }
        }
        return res;
    }

}
