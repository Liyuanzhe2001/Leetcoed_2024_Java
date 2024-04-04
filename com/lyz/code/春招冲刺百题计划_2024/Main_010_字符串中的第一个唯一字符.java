package com.lyz.code.春招冲刺百题计划_2024;

/**
 * @author lkunk
 * @date 2024年04月04日 23:17
 * @description
 */

public class Main_010_字符串中的第一个唯一字符 {
    public int firstUniqChar(String s) {
        int[] cnt = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            cnt[c - 'a']++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (cnt[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
