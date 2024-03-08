package com.lyz.code.hikvision;

import java.util.Stack;

/**
 * @author lkunk
 * @date 2024年03月08日 15:07
 * @description
 */
// TODO 表现良好的最长时间段
public class main_046_表现良好的最长时间段 {
    public int longestWPI(int[] hours) {
        int n = hours.length;
        Stack<Integer> stack = new Stack<>();
        int[] pre = new int[n + 1];
        stack.push(0);
        for (int i = 1; i <= n; i++) {
            pre[i] = pre[i - 1] + (hours[i - 1] > 8 ? 1 : -1);
            if (pre[i] < pre[stack.peek()]) {
                stack.push(i);
            }
        }
        int res = 0;
        for (int i = n; i > 0; --i) {
            while (!stack.isEmpty() && pre[i] > pre[stack.peek()]) {
                res = Math.max(res, i - stack.pop());
            }
        }
        return res;
    }
}
