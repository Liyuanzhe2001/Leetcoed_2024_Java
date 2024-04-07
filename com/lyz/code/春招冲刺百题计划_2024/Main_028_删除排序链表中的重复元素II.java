package com.lyz.code.春招冲刺百题计划_2024;

import com.lyz.code.structure.ListNode;

/**
 * @author lkunk
 * @date 2024年04月07日 21:03
 * @description
 */

public class Main_028_删除排序链表中的重复元素II {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
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
