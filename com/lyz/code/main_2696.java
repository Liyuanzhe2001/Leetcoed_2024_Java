package com.lyz.code;

import java.util.Stack;

/**
 * @author lkunk
 * @date 2024年01月10日 23:38
 * @description
 */

public class main_2696 {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(' ');
        for (char c : s.toCharArray()) {
            if ((c == 'B' && stack.peek() == 'A') || (c == 'D' && stack.peek() == 'C')) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.size() - 1;
    }
}
