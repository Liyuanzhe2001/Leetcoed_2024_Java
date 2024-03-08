package com.lyz.code.hikvision;

/**
 * @author lkunk
 * @date 2024年03月08日 14:33
 * @description
 */

public class main_042_二分查找 {
    public int search(int[] nums, int target) {
        int lef = 0;
        int rig = nums.length - 1;
        while (lef <= rig) {
            int mid = lef + (rig - lef) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                lef = mid + 1;
            } else {
                rig = mid - 1;
            }
        }
        return -1;
    }
}
