package com.lyz.code;

import com.lyz.code.structure.ListNode;

/**
 * @author lkunk
 * @date 2024年01月15日 21:03
 * @description
 */

public class main_82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        boolean f = false;
        while (head.next != null && head.val == head.next.val) {
            head = head.next;
            f = true;
        }
        if (f) {
            return deleteDuplicates(head.next);
        }
        head.next = deleteDuplicates(head.next);
        return head;
    }
}
