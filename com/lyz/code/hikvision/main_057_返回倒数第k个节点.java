package com.lyz.code.hikvision;

import com.lyz.code.structure.ListNode;

/**
 * @author lkunk
 * @date 2024年03月08日 17:02
 * @description
 */

public class main_057_返回倒数第k个节点 {
    public int kthToLast(ListNode head, int k) {
        ListNode node = head;
        while (k-- != 0) {
            node = node.next;
        }
        while (node != null) {
            head = head.next;
            node = node.next;
        }
        return head.val;
    }
}
