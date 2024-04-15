package com.lyz.code;

import java.util.Arrays;

/**
 * @author lkunk
 * @date 2024年04月15日 23:12
 * @description
 */

public class main_706 {
    class MyHashMap {

        int[] nums;

        public MyHashMap() {
            nums = new int[1000001];
            Arrays.fill(nums,-1);
        }

        public void put(int key, int value) {
            nums[key] = value;
        }

        public int get(int key) {
            return nums[key];
        }

        public void remove(int key) {
            nums[key] = -1;
        }
    }
}
