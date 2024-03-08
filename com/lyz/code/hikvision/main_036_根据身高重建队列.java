package com.lyz.code.hikvision;

import java.util.*;

/**
 * @author lkunk
 * @date 2024年03月08日 11:47
 * @description
 */

public class main_036_根据身高重建队列 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> {
            if (o1[0] != o2[0]) {
                return o2[0] - o1[0];
            } else {
                return o1[1] - o2[1];
            }
        });
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            if (people[i][1] > i) {
                list.add(people[i][1], people[i]);
            } else {
                list.add(people[i]);
            }
        }
        return list.toArray(new int[0][]);
    }
}
