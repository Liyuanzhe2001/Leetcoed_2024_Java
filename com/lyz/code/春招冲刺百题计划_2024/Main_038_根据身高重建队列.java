package com.lyz.code.春招冲刺百题计划_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年04月09日 23:06
 * @description
 */

public class Main_038_根据身高重建队列 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, ((o1, o2) -> {
            if (o1[0] != o2[0]) {
                return o2[0] - o1[0];
            } else {
                return o1[1] - o2[1];
            }
        }));
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            if (people[i][1] < i) {
                list.add(people[i][1], people[i]);
            } else {
                list.add(people[i]);
            }
        }
        return list.toArray(new int[0][]);
    }
}
