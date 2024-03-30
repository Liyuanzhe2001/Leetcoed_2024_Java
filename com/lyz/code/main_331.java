package com.lyz.code;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author lkunk
 * @date 2024年03月31日 0:03
 * @description
 */

public class main_331 {
    public boolean isValidSerialization(String preorder) {
        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        String[] split = preorder.split(",");
        for (String s : split) {
            if(stack.isEmpty()){
                return false;
            }
            int top = stack.pop() - 1;
            if (top > 0) {
                stack.push(top);
            }
            if (!s.equals("#")) {
                stack.push(2);
            }
        }
        return stack.isEmpty();
    }
}
