package com.lyz.code;

import com.lyz.code.structure.ListNode;

/**
 * @author lkunk
 * @date 2024年01月14日 12:01
 * @description
 */

public class main_83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        while (head.next != null && head.val == head.next.val) {
            head = head.next;
        }
        head.next = deleteDuplicates(head.next);
        return head;
    }
}
