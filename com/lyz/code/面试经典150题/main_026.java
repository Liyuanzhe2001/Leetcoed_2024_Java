package com.lyz.code.面试经典150题;

/**
 * @author lkunk
 * @date 2024年02月25日 16:18
 * @description
 */

public class main_026 {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;
        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
                tIndex++;
            } else {
                tIndex++;
            }
        }
        return sIndex == s.length();
    }
}
