package com.lyz.code.hikvision;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年03月07日 14:44
 * @description
 */

public class main_012_全排列 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        dfs(new ArrayList<>(), nums, visited);
        return res;
    }

    public void dfs(List<Integer> list, int[] nums, boolean[] visited) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                list.add(nums[i]);
                visited[i] = true;
                dfs(list, nums, visited);
                visited[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }

}
