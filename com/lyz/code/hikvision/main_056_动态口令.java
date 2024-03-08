package com.lyz.code.hikvision;

/**
 * @author lkunk
 * @date 2024年03月08日 17:00
 * @description
 */

public class main_056_动态口令 {
    public String dynamicPassword(String password, int target) {
        return password.substring(target) + password.substring(0, target);
    }
}
