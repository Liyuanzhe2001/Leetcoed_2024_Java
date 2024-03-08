package com.lyz.code.hikvision;

import com.lyz.code.structure.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author lkunk
 * @date 2024年03月08日 11:39
 * @description
 */

public class main_033_回文链表 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int lef = 0;
        int rig = list.size() - 1;
        while (lef < rig) {
            if (!Objects.equals(list.get(lef++), list.get(rig--))) {
                return false;
            }
        }
        return true;
    }
}
