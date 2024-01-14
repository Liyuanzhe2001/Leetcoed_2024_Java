package com.lyz.code.structure;

/**
 * @author lkunk
 * @date 2024年01月14日 12:02
 * @description
 */

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
