package com.lyz.code.春招冲刺百题计划_2024;

import com.lyz.code.structure.ListNode;

/**
 * @author lkunk
 * @date 2024年04月08日 20:45
 * @description
 */

public class Main_032_相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while (headA != headB) {
            headA = headA == null ? b : headA.next;
            headB = headB == null ? a : headB.next;
        }
        return headA;
    }
}
