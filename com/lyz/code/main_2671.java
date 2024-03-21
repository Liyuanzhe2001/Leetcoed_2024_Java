package com.lyz.code;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lkunk
 * @date 2024年03月21日 16:08
 * @description
 */

public class main_2671 {
    class FrequencyTracker {
        Map<Integer, Integer> map = new HashMap<>();
        int[] cnt = new int[100001];

        public FrequencyTracker() {
        }

        public void add(int number) {
            if (map.containsKey(number)) {
                Integer val = map.get(number);
                map.put(number, val + 1);
                cnt[val]--;
                cnt[val + 1]++;
            } else {
                map.put(number, 1);
                cnt[1]++;
            }
        }

        public void deleteOne(int number) {
            if (map.containsKey(number)) {
                Integer val = map.get(number);
                if (val != 1) {
                    cnt[val]--;
                    cnt[val - 1]++;
                    map.put(number, val - 1);
                } else {
                    map.remove(number);
                    cnt[val]--;
                }

            }
        }

        public boolean hasFrequency(int frequency) {
            return cnt[frequency] != 0;
        }
    }
}
