package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年04月01日 20:00
 * @description
 */

public class main_2810 {
    public String finalString(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == 'i') {
                res.reverse();
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
