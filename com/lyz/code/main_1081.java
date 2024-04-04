package com.lyz.code;

import java.util.Stack;

/**
 * @author lkunk
 * @date 2024年04月04日 22:13
 * @description
 */

public class main_1081 {
    public String smallestSubsequence(String s) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
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
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
