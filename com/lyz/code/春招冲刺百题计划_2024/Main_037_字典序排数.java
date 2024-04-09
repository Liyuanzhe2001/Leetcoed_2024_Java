package com.lyz.code.春招冲刺百题计划_2024;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年04月09日 23:03
 * @description
 */

public class Main_037_字典序排数 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        int num = 1;
        for (int i = 0; i < n; i++) {
            res.add(num);
            if (num * 10 <= n) {
                num *= 10;
            } else {
                while (num % 10 == 9 || num + 1 > n) {
                    num /= 10;
                }
                num++;
            }
        }
        return res;
    }
}
