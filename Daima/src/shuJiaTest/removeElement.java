package shuJiaTest;

public class removeElement {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode pre = head;
        ListNode cur = pre.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                cur = pre.next;

            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }

    public ListNode reverseListNode(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        ListNode newHead = null;
        while (cur != null) {
            ListNode next = cur.next;
            if (next == null) {
                return cur;
            }
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return newHead;
    }
}

