package com.lyz.code.hikvision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author lkunk
 * @date 2024年03月07日 20:35
 * @description
 */

public class main_028_课程表 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }
        int[] cnt = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            list.get(prerequisite[1]).add(prerequisite[0]);
            cnt[prerequisite[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (cnt[i] == 0) {
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            Integer course = queue.poll();
            numCourses--;
            for (Integer i : list.get(course)) {
                if (--cnt[i] == 0) {
                    queue.add(i);
                }
            }
        }
        return numCourses == 0;
    }

}
