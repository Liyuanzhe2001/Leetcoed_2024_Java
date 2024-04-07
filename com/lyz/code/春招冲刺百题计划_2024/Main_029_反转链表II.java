package com.lyz.code.春招冲刺百题计划_2024;

import com.lyz.code.structure.ListNode;

/**
 * @author lkunk
 * @date 2024年04月07日 21:07
 * @description
 */

public class Main_029_反转链表II {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode node = new ListNode();
        node.next = head;
        ListNode node0 = node;
        for (int i = 0; i < left - 1; i++) {
            node0 = node0.next;
        }
        ListNode pre = null, cur = node0.next;
        for (int i = 0; i < right - left + 1; ++i) {
            ListNode nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        node0.next.next = cur;
        node0.next = pre;
        return node.next;
    }
}
