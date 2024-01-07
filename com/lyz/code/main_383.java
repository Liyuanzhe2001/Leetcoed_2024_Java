package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年01月07日 21:28
 * @description
 */

public class main_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] cnt = new int[26];
        for (char c : magazine.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            cnt[c - 'a']--;
            if (cnt[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
