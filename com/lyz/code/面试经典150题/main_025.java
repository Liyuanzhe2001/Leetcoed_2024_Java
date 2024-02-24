package com.lyz.code.面试经典150题;

/**
 * @author lkunk
 * @date 2024年02月24日 23:46
 * @description
 */

public class main_025 {
    public boolean isPalindrome(String s) {
        int lef = 0;
        int n = s.length();
        int rig = s.length() - 1;
        char[] chars = s.toLowerCase().toCharArray();
        while (lef < rig) {
            while (lef < n && !Character.isLetterOrDigit(chars[lef])) {
                lef++;
            }
            while (rig >= 0 && !Character.isLetterOrDigit(chars[rig])) {
                rig--;
            }
            if (lef < rig && chars[lef] != chars[rig]) {
                System.out.println(lef + " " + rig + " " + chars[lef] + " " + chars[rig]);
                return false;
            }
            lef++;
            rig--;
        }
        return true;
    }
}
