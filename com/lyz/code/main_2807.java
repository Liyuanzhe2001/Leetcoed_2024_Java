package com.lyz.code;

import java.util.List;

/**
 * @author lkunk
 * @date 2024年01月06日 23:23
 * @description
 */

public class main_2807 {

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

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        for (ListNode tmpNode = head; tmpNode.next != null; tmpNode = tmpNode.next.next) {
            ListNode nextNode = new ListNode(cal(tmpNode.val, tmpNode.next.val));
            nextNode.next = tmpNode.next;
            tmpNode.next = nextNode;
        }
        return head;
    }

    public int cal(int x, int y) {
        while (y != 0) {
            int a = x % y;
            x = y;
            y = a;
        }
        return x;
    }

}
