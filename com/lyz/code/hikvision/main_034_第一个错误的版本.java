package com.lyz.code.hikvision;

/**
 * @author lkunk
 * @date 2024年03月08日 11:41
 * @description
 */

public class main_034_第一个错误的版本 {
    public int firstBadVersion(int n) {
        int lef = 1;
        int rig = n;
        while (lef < rig) {
            // 防止溢出
            int mid = lef + (rig - lef) / 2;
            if (isBadVersion(mid)) {
                rig = mid - 1;
            } else {
                lef = mid + 1;
            }
        }
        return lef;
    }

    boolean isBadVersion(int i) {
        return true;
    }
}
