package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年04月14日 22:31
 * @description
 */

public class main_705 {
    class MyHashSet {

        boolean[] bool;
        public MyHashSet() {
            bool = new boolean[1000001];
        }

        public void add(int key) {
            bool[key] = true;
        }

        public void remove(int key) {
            bool[key] = false;
        }

        public boolean contains(int key) {
            return bool[key];
        }
    }
}
