package com.lyz.code.hikvision;

import java.util.Stack;

/**
 * @author lkunk
 * @date 2024年03月08日 11:05
 * @description
 */

public class main_031_基本计算器 {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int preSign = 1;
        int num = 0;
        int res = 0;
        for (char c : s.toCharArray()) {
            if (c <= '9' && c >= '0') {
                num = num * 10 + (c - '0');
            } else if (c == '+') {
                res = res + preSign * num;
                preSign = 1;
                num = 0;
            } else if (c == '-') {
                res = res + preSign * num;
                preSign = -1;
                num = 0;
            } else if (c == '(') {
                stack.push(res);
                stack.push(preSign);
                preSign = 1;
                res = 0;
            } else if (c == ')') {
                res += preSign * num;
                num = 0;
                res *= stack.pop();
                res += stack.pop();
            }
        }
        return res + preSign * num;
    }
}
