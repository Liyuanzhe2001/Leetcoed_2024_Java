package com.lyz.code;

import javax.swing.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author lkunk
 * @date 2024年05月01日 23:04
 * @description
 */

public class main_2462 {
    public long totalCost(int[] costs, int k, int candidates) {
        long res = 0;
        if (candidates * 2 + k > costs.length) {
            Arrays.sort(costs);
            for (int i = 0; i < k; i++) {
                res += costs[i];
            }
            return res;
        }
        Queue<Integer> preQueue = new PriorityQueue<>();
        Queue<Integer> aftQueue = new PriorityQueue<>();
        int lef = 0;
        int rig = costs.length - 1;
        while (lef < candidates) {
            preQueue.add(costs[lef++]);
            aftQueue.add(costs[rig--]);
        }
        while (k-- > 0) {
            if (preQueue.peek() <= aftQueue.peek()) {
                res += preQueue.poll();
                preQueue.add(costs[lef++]);
            } else {
                res += aftQueue.poll();
                aftQueue.add(costs[rig--]);
            }
        }
        return res;
    }
}
