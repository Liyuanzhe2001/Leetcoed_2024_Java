package com.lyz.code.面试经典150题;

/**
 * @author lkunk
 * @date 2024年03月01日 16:26
 * @description
 */

public class main_039 {
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
