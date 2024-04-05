package com.lyz.code.春招冲刺百题计划_2024;

import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author lkunk
 * @date 2024年04月05日 22:32
 * @description
 */

public class Main_014_数组中的第K个最大元素 {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            if (queue.size() < k) {
                queue.add(num);
            } else if (queue.peek() < num) {
                queue.poll();
                queue.add(num);
            }
        }
        return queue.peek();
    }
}
