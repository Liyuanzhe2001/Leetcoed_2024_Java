package com.lyz.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年01月20日 22:46
 * @description
 */

public class main_2788 {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            StringBuilder str = new StringBuilder("");
            for (char c : word.toCharArray()) {
                if (c == separator) {
                    if (str.length() > 0) {
                        res.add(str.toString());
                        str.setLength(0);
                    }
                } else {
                    str.append(c);
                }
            }
            if (str.length() > 0) {
                res.add(str.toString());
            }
        }
        return res;
    }
}
