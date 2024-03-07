package com.lyz.code.hikvision;

import com.lyz.code.structure.ListNode;

/**
 * @author lkunk
 * @date 2024年03月07日 11:15
 * @description
 */

public class main_010_合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode res = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                head.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            head = head.next;
        }
        while (list1 != null) {
            head.next = new ListNode(list1.val);
            list1 = list1.next;
            head = head.next;
        }
        while (list2 != null) {
            head.next = new ListNode(list2.val);
            list2 = list2.next;
            head = head.next;
        }
        return res.next;
    }
}
