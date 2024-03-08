package com.lyz.code.hikvision;

import com.lyz.code.structure.ListNode;

/**
 * @author lkunk
 * @date 2024年03月08日 16:54
 * @description
 */

public class main_055_训练计划V {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode headOne = headA;
        ListNode headTwo = headB;
        while (headA != headB) {
            headA = headA == null? headTwo:headA.next;
            headB = headB == null? headOne:headB.next;
        }
        return headOne;
    }
}
