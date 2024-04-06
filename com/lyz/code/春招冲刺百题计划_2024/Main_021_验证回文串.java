package com.lyz.code.春招冲刺百题计划_2024;

/**
 * @author lkunk
 * @date 2024年04月06日 22:03
 * @description
 */

public class Main_021_验证回文串 {
    public boolean isPalindrome(String s) {
        int lef = 0;
        int rig = s.length() - 1;
        char[] cs = s.toLowerCase().toCharArray();
        while (lef < rig) {
            while (lef < cs.length && !Character.isLetterOrDigit(cs[lef])) {
                lef++;
            }
            while (rig >= 0 && !Character.isLetterOrDigit(cs[rig])) {
                rig--;
            }
            if (lef < rig && cs[lef] != cs[rig]) {
                return false;
            }
            lef++;
            rig--;
        }
        return true;
    }
}
