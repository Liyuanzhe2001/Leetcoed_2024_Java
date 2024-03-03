package com.lyz.code;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lkunk
 * @date 2024年03月03日 21:49
 * @description
 */

public class main_225 {
    class MyStack {
        Queue<Integer> queue1;
        Queue<Integer> queue2;

        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        public void push(int x) {
            while (!queue1.isEmpty()) {
                queue2.add(queue1.poll());
            }
            queue1.add(x);
            while (!queue2.isEmpty()) {
                queue1.add(queue2.poll());
            }
        }

        public int pop() {
            return queue1.poll();
        }

        public int top() {
            return queue1.peek();
        }

        public boolean empty() {
            return queue1.isEmpty();
        }
    }
}
