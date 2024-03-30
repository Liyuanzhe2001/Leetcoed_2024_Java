package com.lyz.code.双周赛127;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lkunk
 * @date 2024年03月30日 22:26
 * @description
 */

public class main_01 {
//    public int minimumSubarrayLength(int[] nums, int k) {
//        int n = nums.length;
//        int left = 0, right = 0;
//        int tmp = 0, res = Integer.MAX_VALUE;
//        int[] cnt = new int[32];
//
//        while (right < n) {
//            if (nums[right] >= n) {
//                return 1;
//            }
//            tmp |= nums[right];
//            int c = nums[right];
//            int i = 0;
//            while (c != 0) {
//                cnt[i] += c & 1;
//                c >>= 1;
//                i++;
//            }
//            System.out.println(Arrays.toString(cnt));
//            while (tmp >= k && left <= right) {
//                res = Math.min(tmp, right - left + 1);
//                c = nums[left];
//                i = 0;
//                while (c != 0) {
//                    if ((c & 1) == 1 && cnt[i] == 1) {
//                        tmp = tmp ^ (1 << i);
//                    }
//                    c >>= 1;
//                    i++;
//                }
//                System.out.println(c + " " + Integer.toBinaryString(tmp));
//                left++;
//            }
//            right++;
//        }
//
//        return res == Integer.MAX_VALUE ? -1 : res;
//    }
/*
[1,2,3]
2
[2,1,8]
10
[1,2]
0
[1,2,32,21]
55
 */

    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        int tmp = 0;
        int[] cnt = new int[32];
        int left = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= k) {
                return 1;
            }
            tmp |= nums[i];
            int c = nums[i];
            int idx = 0;
            while (c != 0) {
                cnt[idx] += c & 1;
                c >>= 1;
                idx++;
            }
            while (tmp >= k && left <= i) {
                res = Math.min(i - left + 1, res);
                c = nums[left];
                idx = 0;
                while (c != 0) {
                    if ((c & 1) == 1) {
                        cnt[idx]--;
                        if (cnt[idx] == 0) {
                            tmp = tmp ^ (1 << idx);
                        }
                    }
                    c >>= 1;
                    idx++;
                }
                left++;
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

}
