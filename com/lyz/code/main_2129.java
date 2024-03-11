package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年03月11日 15:34
 * @description
 */

public class main_2129 {
    public String capitalizeTitle(String title) {
        String[] ss = title.toLowerCase().split(" ");
        StringBuffer str = new StringBuffer();
        for (String s : ss) {
            if (s.length() > 2) {
                str.append((char) (s.charAt(0) + 'A' - 'a')).append(s.substring(1)).append(" ");
            } else {
                str.append(s).append(" ");
            }
        }
        return str.substring(0, str.length() - 1);
    }
}
