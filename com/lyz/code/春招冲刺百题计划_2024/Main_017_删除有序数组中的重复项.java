package com.lyz.code.春招冲刺百题计划_2024;

/**
 * @author lkunk
 * @date 2024年04月05日 23:06
 * @description
 */

public class Main_017_删除有序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        int no = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[no++] = nums[i];
            }
        }
        return no;
    }
}
