package com.lyz.code.hikvision;

import java.util.*;

/**
 * @author lkunk
 * @date 2024年03月08日 14:40
 * @description
 */

public class main_044_公交路线 {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) {
            return 0;
        }
        Map<Integer, Set<Integer>> map = new HashMap<>();
        Deque<Integer> d = new ArrayDeque<>();
        Map<Integer, Integer> m = new HashMap<>();
        int n = routes.length;
        for (int i = 0; i < n; i++) {
            for (int station : routes[i]) {
                if (station == source) {
                    d.addLast(i);
                    m.put(i, 1);
                }
                Set<Integer> set = map.getOrDefault(station, new HashSet<>());
                set.add(i);
                map.put(station, set);
            }
        }
        while (!d.isEmpty()) {
            int poll = d.pollFirst();
            int step = m.get(poll);
            for (int station : routes[poll]) {
                if (station == target) {
                    return step;
                }
                Set<Integer> lines = map.get(station);
                if (lines == null) {
                    continue;
                }
                for (int nr : lines) {
                    if (!m.containsKey(nr)) {
                        m.put(nr, step + 1);
                        d.add(nr);
                    }
                }
            }
        }
        return -1;
    }
}
