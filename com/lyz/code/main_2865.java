package com.lyz.code;

import java.util.List;
import java.util.Stack;

/**
 * @author lkunk
 * @date 2024年01月24日 23:13
 * @description
 */

public class main_2865 {
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        long res = 0;
        int n = maxHeights.size();
        long[] pref = new long[n];
        long[] last = new long[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && maxHeights.get(i) < maxHeights.get(stack.peek())) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                pref[i] = (long) (i + 1) * maxHeights.get(i);
            } else {
                pref[i] = pref[stack.peek()] + (long) (i - stack.peek()) * maxHeights.get(i);
            }
            stack.push(i);
        }
        stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && maxHeights.get(i) < maxHeights.get(stack.peek())) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                last[i] = (long) (n - i) * maxHeights.get(i);
            } else {
                last[i] = last[stack.peek()] + (long) (stack.peek() - i) * maxHeights.get(i);
            }
            stack.push(i);
            res = Math.max(res, pref[i] + last[i] - maxHeights.get(i));
        }
        return res;
    }
}
