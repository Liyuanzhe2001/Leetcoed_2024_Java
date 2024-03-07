package com.lyz.code.hikvision;

/**
 * @author lkunk
 * @date 2024年03月07日 15:24
 * @description
 */

public class main_018_删除有序数组中的重复项II {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int slow = 2;
        int fast = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        return slow;
    }
}
