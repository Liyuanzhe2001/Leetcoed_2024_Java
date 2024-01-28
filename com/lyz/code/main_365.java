package com.lyz.code;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author lkunk
 * @date 2024年01月28日 23:13
 * @description
 */

public class main_365 {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0, 0});
        Set<Long> set = new HashSet<>();
        while (!stack.empty()) {
            long h = hash(stack.peek());
            if (set.contains(h)) {
                stack.pop();
                continue;
            }
            set.add(h);
            int[] tmp = stack.pop();
            int c1 = tmp[0], c2 = tmp[1];
            if (c1 == targetCapacity || c2 == targetCapacity || c1 + c2 == targetCapacity) {
                return true;
            }
            stack.push(new int[]{jug1Capacity, c2});
            stack.push(new int[]{c1, jug2Capacity});
            stack.push(new int[]{0, c2});
            stack.push(new int[]{c1, 0});
            stack.push(new int[]{c1 - Math.min(c1, jug2Capacity - c2), c2 + Math.min(c1, jug2Capacity - c2)});
            stack.push(new int[]{c1 + Math.min(c2, jug1Capacity - c1), c2 - Math.min(c2, jug1Capacity - c1)});
        }
        return false;
    }

    public long hash(int[] state) {
        return (long) state[0] * 1000001 + state[1];
    }

}
