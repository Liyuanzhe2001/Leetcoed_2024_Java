package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年04月09日 22:52
 * @description
 */

public class main_2529 {
    public int maximumCount(int[] nums) {
        int neg = lowerBound(nums, 0);
        int pos = nums.length - lowerBound(nums, 1);
        return Math.max(neg, pos);
    }

    private int lowerBound(int[] nums, int target) {
        int left = -1;
        int right = nums.length;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }
}
