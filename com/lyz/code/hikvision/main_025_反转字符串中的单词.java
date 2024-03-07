package com.lyz.code.hikvision;

/**
 * @author lkunk
 * @date 2024年03月07日 20:22
 * @description
 */

public class main_025_反转字符串中的单词 {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String[] res = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            res[i] = words[words.length - i - 1];
        }
        return String.join(" ", res);
    }
}
