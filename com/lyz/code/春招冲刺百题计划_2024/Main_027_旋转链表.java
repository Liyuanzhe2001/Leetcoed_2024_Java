package com.lyz.code.春招冲刺百题计划_2024;

import com.lyz.code.structure.ListNode;
import com.lyz.code.structure.TreeNode;

/**
 * @author lkunk
 * @date 2024年04月07日 20:56
 * @description
 */

public class Main_027_旋转链表 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode node = head;
        int n = 1;
        while (node.next != null) {
            node = node.next;
            n++;
        }
        node.next = head;
        n = n - k % n - 1;
        while (n > 0) {
            head = head.next;
            n--;
        }
        ListNode tmp = head.next;
        head.next = null;
        return tmp;
    }
}
