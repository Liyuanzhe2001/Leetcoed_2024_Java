package com.lyz.code.春招冲刺百题计划_2024;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author lkunk
 * @date 2024年04月03日 23:20
 * @description
 */

public class Main_008_去除重复字母 {
    public String smallestSubsequence(String s) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) count[ch - 'a']++;
        boolean[] inStack = new boolean[26];
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            count[ch - 'a']--;
            if (inStack[ch - 'a']) {
                continue;
            }
            while (!stack.empty() && stack.peek() > ch) {
                if (count[stack.peek() - 'a'] == 0) {
                    break;
                }
                inStack[stack.pop() - 'a'] = false;
            }
            stack.push(ch);
            inStack[ch - 'a'] = true;
        }
        while (!stack.empty()) sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
