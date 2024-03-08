package com.lyz.code.hikvision;

/**
 * @author lkunk
 * @date 2024年03月08日 14:31
 * @description
 */

public class main_041_宝石与石头 {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] jewel = new boolean[128];
        for (char c : jewels.toCharArray()) {
            jewel[c] = true;
        }
        int res = 0;
        for (char c : stones.toCharArray()) {
            if (jewel[c]) {
                res++;
            }
        }
        return res;
    }
}
