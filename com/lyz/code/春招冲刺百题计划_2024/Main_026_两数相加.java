package com.lyz.code.春招冲刺百题计划_2024;

import com.lyz.code.structure.ListNode;

import java.util.List;

/**
 * @author lkunk
 * @date 2024年04月07日 20:47
 * @description
 */

public class Main_026_两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            if(l1.val >=10){
                l1.val -=10;
                if (l1.next != null) {
                    l1.next.val++;
                } else {
                    l1.next = new ListNode(1);
                }
                addTwoNumbers(l1.next, l2);
            }
            return l1;
        }
        int l = l1.val + l2.val;
        ListNode node = new ListNode(l % 10);
        if (l >= 10) {
            if (l1.next != null) {
                l1.next.val++;
            } else {
                l1.next = new ListNode(1);
            }
        }
        node.next = addTwoNumbers(l1.next, l2.next);
        return node;
    }
}
