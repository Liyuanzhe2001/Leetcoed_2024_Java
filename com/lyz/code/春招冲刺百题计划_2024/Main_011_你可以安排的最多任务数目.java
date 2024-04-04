package com.lyz.code.春招冲刺百题计划_2024;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author lkunk
 * @date 2024年04月04日 23:22
 * @description
 */
// TODO 2071
public class Main_011_你可以安排的最多任务数目 {
    class Solution {
        int[] tasks;
        int[] workers;
        int pills;
        int strength;

        public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
            Arrays.sort(tasks);
            Arrays.sort(workers);
            this.tasks = tasks;
            this.workers = workers;
            this.pills = pills;
            this.strength = strength;
            int l = 0, r = Math.min(tasks.length, workers.length);
            //求最后一个满足要求的点
            while (l < r) {
                int k = (l + r + 1) >> 1;
                if (check(k)) {
                    l = k;
                } else {
                    r = k - 1;
                }
            }
            return l;
        }

        /**
         * 检测是否能完成k个任务
         * 最大的k个工人 能否完成 最小的k个任务
         */
        boolean check(int k) {
            int p = pills;
            TreeMap<Integer, Integer> workersMap = new TreeMap();
            //把最大的k个工人放到有序集合里面
            for (int i = workers.length - k; i < workers.length; i++) {
                workersMap.put(workers[i], workersMap.getOrDefault(workers[i], 0) + 1);
            }
            //从大到小枚举任务
            for (int i = k - 1; i >= 0; i--) {
                int task = tasks[i];
                Map.Entry<Integer, Integer> en = workersMap.lastEntry();
                //1.当前最大工人不吃药 可以完成当前任务
                if (en.getKey() >= task) {
                    if (en.getValue() <= 1) {
                        workersMap.remove(en.getKey());
                    } else {
                        workersMap.put(en.getKey(), en.getValue() - 1);
                    }
                }
                //2.当前最大工人吃药 可以完成当前任务
                else if (p > 0 && (en = workersMap.ceilingEntry(task - strength)) != null) {
                    p--;
                    if (en.getValue() <= 1) {
                        workersMap.remove(en.getKey());
                    } else {
                        workersMap.put(en.getKey(), en.getValue() - 1);
                    }
                }
                //3.没药了 或者 吃药也不行
                else {
                    return false;
                }
            }
            return true;
        }
    }
}
