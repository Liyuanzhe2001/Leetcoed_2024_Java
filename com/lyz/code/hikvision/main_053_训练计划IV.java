package com.lyz.code.hikvision;

import com.lyz.code.structure.ListNode;

import java.util.List;

/**
 * @author lkunk
 * @date 2024年03月08日 16:33
 * @description
 */

public class main_053_训练计划IV {
    public ListNode trainningPlan(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode head = node;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                node.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                node.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            node = node.next;
        }
        while (l1 != null) {
            node.next = new ListNode(l1.val);
            l1 = l1.next;
            node = node.next;
        }
        while (l2 != null) {
            node.next = new ListNode(l2.val);
            l2 = l2.next;
            node = node.next;
        }
        return head.next;
    }
}
