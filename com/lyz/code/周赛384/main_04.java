package com.lyz.code.周赛384;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lkunk
 * @date 2024年02月11日 23:50
 * @description
 */

public class main_04 {
    public int maxPalindromesAfterOperations(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        Map<Character, Integer> map = new HashMap<>();
        int total = 0;
        for (String word : words) {
            total += word.length();
            for (char c : word.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        int n = 0;
        for (Integer value : map.values()) {
            if (value % 2 != 0) {
                n++;
            }
        }
        total = total - n;
        int res = 0;
        for (String w : words) {
            total -= w.length() / 2 * 2;
            if (total < 0) {
                break;
            }
            res++;
        }
        return res;
    }
}
