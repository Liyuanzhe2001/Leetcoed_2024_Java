package com.lyz.code.周赛392;

/**
 * @author lkunk
 * @date 2024年04月07日 10:26
 * @description
 */

public class Main_02 {
    public String getSmallestString(String s, int k) {
        String res = "";
        if (k == 0) {
            return s;
        }
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length && k > 0; i++) {


            char closestC = getClosestSmallerChar(cs[i], k);
            int c = Math.abs(closestC - cs[i]);
            if (Math.abs(closestC - cs[i]) > 13) {
                c = 26 - c;
            }
            k = k - c;
            cs[i] = closestC;
        }
        return new String(cs);
    }

    public char getClosestSmallerChar(char c, int n) {
        if (c + n > 'z') {
            return 'a';
        }
        if (c - n < 'a') {
            return 'a';
        }
        return (char) (c - n);
    }

    public static int cyclicDistance(char c1, char c2) {
        char a = (char) Math.max(c1, c2);
        char b = (char) Math.min(c1, c2);
        int minChar = 'a';
        int maxChar = 'z';
        int diff = Math.abs(b - a);
        if (diff > (maxChar - minChar) / 2) {
            diff = (maxChar - a) + (b - minChar);
        }
        return diff;
    }
}
