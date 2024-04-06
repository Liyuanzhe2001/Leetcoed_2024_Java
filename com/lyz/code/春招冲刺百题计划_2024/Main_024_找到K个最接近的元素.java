package com.lyz.code.春招冲刺百题计划_2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年04月06日 22:26
 * @description
 */

public class Main_024_找到K个最接近的元素 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<Integer>();
        for (int num : arr) {
            list.add(num);
        }
        Collections.sort(list, (a, b) -> {
            if (Math.abs(a - x) != Math.abs(b - x)) {
                return Math.abs(a - x) - Math.abs(b - x);
            } else {
                return a - b;
            }
        });
        List<Integer> ans = list.subList(0, k);
        Collections.sort(ans);
        return ans;
    }
}
