package com.lyz.code.hikvision;

/**
 * @author lkunk
 * @date 2024年03月07日 10:52
 * @description
 */

public class main_007_最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return str.toString();
                }
            }
            str.append(c);
        }
        return str.toString();
    }
}
