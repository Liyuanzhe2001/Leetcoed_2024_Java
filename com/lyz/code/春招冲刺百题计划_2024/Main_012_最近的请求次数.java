package com.lyz.code.春招冲刺百题计划_2024;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年04月04日 23:22
 * @description
 */

public class Main_012_最近的请求次数 {
    class RecentCounter {

        List<Integer> list = new ArrayList<>();

        public RecentCounter() {

        }

        public int ping(int t) {
            int res = 0;
            list.add(t);
            for (int i = list.size() - 1; i >= 0; i--) {
                if (t - list.get(i) <= 3000) {
                    res++;
                } else {
                    break;
                }
            }
            return res;
        }
    }
}
