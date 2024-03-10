package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年03月10日 22:21
 * @description
 */

public class main_299 {
    public String getHint(String secret, String guess) {
        int[] cnt = new int[10];
        int a = 0;
        int b = 0;
        int n = secret.length();
        for (int i = 0; i < n; i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                a++;
            } else {
                cnt[secret.charAt(i) - '0']++;
                cnt[guess.charAt(i) - '0']--;
            }
        }
        for (int i = 0; i < 10; i++) {
            b += Math.max(cnt[i], 0);
        }
        return a + "A" + b + "B";
    }
}
