package com.lyz.code.hikvision;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lkunk
 * @date 2024年03月08日 16:09
 * @description
 */

public class main_050_寻找文件副本 {
    public int findRepeatDocument(int[] documents) {
        for (int i = 0; i < documents.length; i++) {
            if (documents[i] != i) {
                if (documents[documents[i]] == documents[i]) {
                    return documents[i];
                }
                int tmp = documents[i];
                documents[i] = documents[documents[i]];
                documents[documents[i]] = tmp;
                i--;
            }
        }
        return -1;
    }
}
