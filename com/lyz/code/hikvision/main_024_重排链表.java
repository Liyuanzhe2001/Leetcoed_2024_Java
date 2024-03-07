package com.lyz.code.hikvision;

import com.lyz.code.structure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lkunk
 * @date 2024年03月07日 16:32
 * @description
 */

public class main_024_重排链表 {
    public void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        for (ListNode tmp = head; tmp != null; tmp = tmp.next) {
            list.add(tmp);
        }
        for (int i = 0; i < list.size() / 2; i++) {
            ListNode node = list.get(list.size() - i - 1);
            node.next = head.next;
            head.next = node;
            head = head.next.next;
        }
        head.next = null;
    }
}
