package com.lyz.code.hikvision;

import com.lyz.code.structure.ListNode;

/**
 * @author lkunk
 * @date 2024年03月06日 21:11
 * @description
 */

public class main_002_两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode head = res;
        int add = 0;
        while (l1 != null || l2 != null) {
            int val = add + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            res.next = new ListNode(val % 10);
            add = val / 10;
            res = res.next;
        }
        if(add != 0) {
            res.next = new ListNode(add);
        }
        return head.next;
    }
}
