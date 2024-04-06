package com.lyz.code.春招冲刺百题计划_2024;

/**
 * @author lkunk
 * @date 2024年04月06日 21:40
 * @description
 */

public class Main_018_合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = nums1.length - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[idx--] = nums1[m--];
            } else {
                nums1[idx--] = nums2[n--];
            }
        }
        while (m >= 0) {
            nums1[idx--] = nums1[m--];
        }
        while (n >= 0) {
            nums1[idx--] = nums2[n--];
        }
    }
}
