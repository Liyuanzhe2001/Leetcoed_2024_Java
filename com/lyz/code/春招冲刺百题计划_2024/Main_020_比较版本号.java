package com.lyz.code.春招冲刺百题计划_2024;

/**
 * @author lkunk
 * @date 2024年04月06日 21:54
 * @description
 */

public class Main_020_比较版本号 {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int n = Math.min(v1.length, v2.length);
        for (int i = 0; i < n; i++) {
            int n1 = Integer.parseInt(v1[i]);
            int n2 = Integer.parseInt(v2[i]);
            if (n1 > n2) {
                return 1;
            } else if (n1 < n2) {
                return -1;
            }
            System.out.println(n1+" "+n2);
        }
        while (n < v1.length) {
            if (Integer.parseInt(v1[n++]) != 0) {
                return 1;
            }
        }
        while (n < v2.length) {
            if (Integer.parseInt(v2[n++]) != 0) {
                return -1;
            }
        }
        return 0;
    }
}
