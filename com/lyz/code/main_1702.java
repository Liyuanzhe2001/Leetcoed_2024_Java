package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年04月10日 20:00
 * @description
 */

public class main_1702 {
    public String maximumBinaryString(String binary) {
        if (!binary.contains("0")) {
            return binary;
        }
        int cnt = 0;
        char[] cs = binary.toCharArray();
        for (int i = binary.indexOf("0") + 1; i < cs.length; i++) {
            cnt += cs[i] - '0';
        }
        return "1".repeat(binary.length() - 1 - cnt) + "0" + "0".repeat(cnt);
    }
}
