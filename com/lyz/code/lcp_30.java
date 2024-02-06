package com.lyz.code;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author lkunk
 * @date 2024年02月06日 20:57
 * @description
 */

public class lcp_30 {
    public int magicTower(int[] nums) {
        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> o1 - o2);
        long now = 1;
        int res = 0;
        long n = 1;
        for (int num : nums) {
            n += num;
            if (num >= 0) {
                now += num;
            } else {
                now += num;
                queue.add(num);
                while (now <= 0) {
                    now -= queue.poll();
                    res++;
                }
            }
        }
        if (n < 0) {
            return -1;
        }
        return res;
    }
}
