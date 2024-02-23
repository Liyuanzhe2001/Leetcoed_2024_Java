package com.lyz.code.面试经典150题;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author lkunk
 * @date 2024年02月23日 20:25
 * @description
 */

public class main_018 {
    public String intToRoman(int num) {
        Map<Integer, String> map = new TreeMap<>((o1, o2) -> o2 - o1) {
            {
                put(1000, "M");
                put(900, "CM");
                put(500, "D");
                put(400, "CD");
                put(100, "C");
                put(90, "XC");
                put(50, "L");
                put(40, "XL");
                put(10, "X");
                put(9, "IX");
                put(5, "V");
                put(4, "IV");
                put(1, "I");
            }
        };
        String res = "";
        for (Integer key : map.keySet()) {
            while (num >= key) {
                num -= key;
                res += map.get(key);
            }
            if (num == 0) {
                return res;
            }
            System.out.println(res);

        }
        return res;
    }
}
