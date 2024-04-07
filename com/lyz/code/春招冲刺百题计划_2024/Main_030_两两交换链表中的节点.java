package com.lyz.code.春招冲刺百题计划_2024;

import com.lyz.code.structure.ListNode;
import com.lyz.code.structure.TreeNode;

/**
 * @author lkunk
 * @date 2024年04月07日 21:11
 * @description
 */

public class Main_030_两两交换链表中的节点 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tmp = head.next;
        head.next = head.next.next;
        tmp.next = head;
        head.next = swapPairs(head.next);
        return tmp;
    }
}
