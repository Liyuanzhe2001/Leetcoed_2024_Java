package com.lyz.code.周赛381;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lkunk
 * @date 2024年02月02日 23:22
 * @description
 */

public class main_3014 {
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
