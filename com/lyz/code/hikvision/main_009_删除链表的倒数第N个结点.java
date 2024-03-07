package com.lyz.code.hikvision;

import com.lyz.code.structure.ListNode;

/**
 * @author lkunk
 * @date 2024年03月07日 11:03
 * @description
 */

public class main_009_删除链表的倒数第N个结点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode();
        res.next = head;
        ListNode fast = head;
        ListNode slow = head;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return res.next;
    }
}
