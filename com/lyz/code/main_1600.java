package com.lyz.code;

import java.util.*;

/**
 * @author lkunk
 * @date 2024年04月07日 20:25
 * @description
 */

public class main_1600 {
    class ThroneInheritance {
        Map<String, List<String>> map;
        Set<String> set;
        String king = "";

        public ThroneInheritance(String kingName) {
            map = new HashMap<>();
            set = new HashSet<>();
            king = kingName;
        }

        public void birth(String parentName, String childName) {
            List<String> list = map.getOrDefault(parentName, new ArrayList<>());
            list.add(childName);
            map.put(parentName, list);
        }

        public void death(String name) {
            set.add(name);
        }

        public List<String> getInheritanceOrder() {
            List<String> list = new ArrayList<>();
            cal(list, king);
            return list;
        }

        public void cal(List<String> list, String n) {
            if (!set.contains(n)) {
                list.add(n);
            }
            for (String s : map.getOrDefault(n, new ArrayList<>())) {
                cal(list, s);
            }
        }
    }
}
