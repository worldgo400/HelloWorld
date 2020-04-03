package LinkedList02;

public class removeList1 {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }


        //          删除链表中的某个元素
        public ListNode removeElement(ListNode head, int val) {
            if (head == null) {
                return null;
            }
            ListNode pre = head;
            ListNode cur = head.next;
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
    }
}

