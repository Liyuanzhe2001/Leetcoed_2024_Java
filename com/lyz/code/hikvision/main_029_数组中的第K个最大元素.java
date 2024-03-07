package com.lyz.code.hikvision;

import java.util.*;

/**
 * @author lkunk
 * @date 2024年03月07日 21:14
 * @description
 */

public class main_029_数组中的第K个最大元素 {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            if (queue.size() < k) {
                queue.add(num);
            } else {
                if (queue.peek() < num) {
                    queue.poll();
                    queue.add(num);
                }
            }
        }
        return queue.peek();
    }
}
