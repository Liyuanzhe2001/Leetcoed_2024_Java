package com.lyz.code.面试经典150题;

import java.util.*;

/**
 * @author lkunk
 * @date 2024年02月22日 23:36
 * @description
 */

public class main_012 {
    class RandomizedSet {

        Map<Integer, Integer> map;
        List<Integer> list;
        Random random;

        public RandomizedSet() {
            map = new HashMap<>();
            list = new ArrayList<>();
            random = new Random();
        }

        public boolean insert(int val) {
            if (map.containsKey(val)) {
                return false;
            }
            map.put(val, list.size());
            list.add(val);
            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)) {
                return false;
            }
            int last = list.get(list.size() - 1);
            int index = map.get(val);
            list.set(index, last);
            map.put(last, index);
            map.remove(val);
            list.remove(list.size() - 1);
            return true;
        }

        public int getRandom() {
            int i = random.nextInt(list.size());
            return list.get(i);
        }
    }
}
