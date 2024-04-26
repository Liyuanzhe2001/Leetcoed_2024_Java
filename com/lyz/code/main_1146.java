package com.lyz.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lkunk
 * @date 2024年04月26日 20:07
 * @description
 */

public class main_1146 {
    class SnapshotArray {
        private int snapId;
        private final Map<Integer, List<int[]>> history = new HashMap<>();

        public SnapshotArray(int length) {
        }

        public void set(int index, int val) {
            List<int[]> list = history.getOrDefault(index, new ArrayList<>());
            list.add(new int[]{snapId, val});
            history.put(index, list);
        }

        public int snap() {
            return snapId++;
        }

        public int get(int index, int snapId) {
            if (!history.containsKey(index)) {
                return 0;
            }
            List<int[]> h = history.get(index);
            int j = search(h, snapId);
            if (j < 0) {
                return 0;
            }
            return h.get(j)[1];
        }

        private int search(List<int[]> h, int x) {
            int left = -1;
            int right = h.size();
            while (left + 1 < right) {
                int mid = left + (right - left) / 2;
                if (h.get(mid)[0] <= x) {
                    left = mid;
                } else {
                    right = mid;
                }
            }
            return left;
        }
    }
}
