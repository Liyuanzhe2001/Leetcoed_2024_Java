package com.lyz.code.双周赛127;

/**
 * @author lkunk
 * @date 2024年03月30日 22:26
 * @description
 */

public class main_03 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 8};
        int k = 10;
        System.out.println(new main_03().minimumSubarrayLength(nums, k));
    }

    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int[] pre = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] | nums[i];
        }
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        for (int right = 1; right <= n; right++) {
            while (pre[right] < k && left < right) {
                left++;
            }
            if (pre[right] >= k) {
                minLength = Math.min(minLength, right - left);
            }
        }
        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }
}
