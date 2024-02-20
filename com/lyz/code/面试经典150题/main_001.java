package com.lyz.code.面试经典150题;

/**
 * @author lkunk
 * @date 2024年02月20日 19:55
 * @description
 */

public class main_001 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length - 1;
        m -= 1;
        n -= 1;
        while (n >= 0 && m >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[i] = nums1[m--];
            } else {
                nums1[i] = nums2[n--];
            }
            i--;
        }
        while (n >= 0) {
            nums1[i--] = nums2[n--];
        }
        while (m >= 0) {
            nums1[i--] = nums1[m--];
        }
    }
}
