package com.lyz.code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年01月25日 22:40
 * @description
 */

public class main_2859 {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int res = 0;
        for (int i = 0; i < nums.size(); i++) {
            Integer num = nums.get(i);
            if (bitCount(i) == k) {
                res += num;
            }
        }
        return res;
    }

    public int bitCount(int x) {
        int cnt = 0;
        while (x != 0) {
            cnt += (x % 2);
            x /= 2;
        }
        return cnt;
    }
}
