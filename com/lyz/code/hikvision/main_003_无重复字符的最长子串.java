package com.lyz.code.hikvision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lkunk
 * @date 2024年03月06日 22:38
 * @description
 */

public class main_003_无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
