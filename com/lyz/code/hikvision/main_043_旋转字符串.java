package com.lyz.code.hikvision;

/**
 * @author lkunk
 * @date 2024年03月08日 14:37
 * @description
 */

public class main_043_旋转字符串 {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
