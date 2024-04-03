package com.lyz.code.春招冲刺百题计划_2024;

import java.util.Stack;

/**
 * @author lkunk
 * @date 2024年04月03日 22:48
 * @description
 */

public class Main_005_有效的括号 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.add(c);
            } else if ((stack.isEmpty()) ||
                    ((c == ')' && stack.peek() != '(') ||
                            (c == ']' && stack.peek() != '[') ||
                            (c == '}' && stack.peek() != '{')
                    )) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
