package com.lyz.code.hikvision;

/**
 * @author lkunk
 * @date 2024年03月07日 15:09
 * @description
 */

public class main_015_有效数字 {
    public boolean isNumber(String s) {
        boolean isNum = false, isDecimal = false, isE = false, isSign = false;
        int len = s.length() - 1;
        for (int i = 0; i <= len; i++) {
            char tmp = s.charAt(i);
            if (0 <= tmp - '0' && tmp - '0' <= 9) {
                isNum = true;
            } else if (tmp == '.') {
                if (isDecimal || (!isNum && i == len) || isE) {
                    return false;
                }
                isDecimal = true;
            } else if (tmp == 'e' || tmp == 'E') {
                if (isE || !isNum || i == len) {
                    return false;
                }
                isE = true;
            } else if (tmp == '-' || tmp == '+') {
                if ((i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') || i == len) {
                    return false;
                }
                isSign = true;
            } else {
                return false;
            }
        }
        return true;
    }
}
