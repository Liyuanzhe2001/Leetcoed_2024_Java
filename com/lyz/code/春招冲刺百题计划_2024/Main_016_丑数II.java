package com.lyz.code.春招冲刺百题计划_2024;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 * @author lkunk
 * @date 2024年04月05日 23:00
 * @description
 */

public class Main_016_丑数II {
    public int nthUglyNumber(int n) {
        Queue<Long> queue = new PriorityQueue<>();
        queue.add(1L);
        int[] x = new int[]{2, 3, 5};
        Set<Long> set = new HashSet<>();
        long res = 0;
        while (n > 0) {
            Long poll = queue.poll();
            res = poll;
            for (int i : x) {
                if (set.add(i * poll)) {
                    queue.add(i * poll);
                }
            }
            n--;
        }
        return (int) res;
    }
}
