package com.lyz.code.hikvision;

/**
 * @author lkunk
 * @date 2024年03月08日 15:01
 * @description
 */

public class main_045_山羊拉丁文 {
    public String toGoatLatin(String sentence) {
        String[] strs = sentence.split(" ");
        int n = 1;
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char c = str.charAt(0);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                str = str + "ma";
            } else {
                str = str.substring(1) + c + "ma";
            }
            for (int j = 0; j < n; j++) {
                str += "a";
            }
            n++;
            strs[i] = str;
        }
        return String.join(" ", strs);
    }
}
