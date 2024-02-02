package com.lyz.code.周赛381;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年02月02日 23:40
 * @description
 */

public class main_3015 {
    public int minimumPushes(String word) {
        int[] cnt = new int[26];
        for (char b : word.toCharArray()) {
            cnt[b - 'a']++;
        }
        Arrays.sort(cnt);

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += cnt[25 - i] * (i / 8 + 1);
        }
        return ans;
    }
}
