package com.lyz.code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年03月25日 20:47
 * @description
 */

public class main_243 {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int length = wordsDict.length;
        int res = length;
        int idx1 = -1;
        int idx2 = -1;
        for (int i = 0; i < length; i++) {
            String word = wordsDict[i];
            if (word.equals(word1)) {
                idx1 = i;
            } else if (word.equals(word2)) {
                idx2 = i;
            }
            if (idx1 >= 0 && idx2 >= 0) {
                res = Math.min(res, Math.abs(idx1 - idx2));
            }
        }
        return res;
    }
}
