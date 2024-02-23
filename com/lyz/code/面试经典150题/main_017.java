package com.lyz.code.面试经典150题;

/**
 * @author lkunk
 * @date 2024年02月23日 20:17
 * @description
 */

public class main_017 {
    public int romanToInt(String s) {
        int res = 0;
        int preVal = getVal(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int curVal = getVal(s.charAt(i));
            if (curVal > preVal) {
                res -= preVal;
            } else {
                res += preVal;
            }
            preVal = curVal;
        }
        return res + preVal;
    }

    public int getVal(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

}
