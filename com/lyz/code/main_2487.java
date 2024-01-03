package com.lyz.code;

/**
 * @author lkunk
 * @date 2024年01月03日 23:58
 * @description
 */

public class main_2487 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNodes(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode node = removeNodes(head.next);
        if (node.val > head.val) {
            return node;
        }
        head.next = node;
        return head;
    }
}
