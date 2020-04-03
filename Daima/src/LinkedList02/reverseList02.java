package LinkedList02;

public class reverseList02 {
    static class  ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
        public ListNode reverseList(ListNode head){
            if (head==null){
                return null;
            }
            if (head.next==null){
                return head;
            }
            ListNode pre=null;
            ListNode cur=head;
            ListNode newHead=null;
            while (cur!=null){
                ListNode next=cur.next;
                if (next==null){
                    return newHead=cur;
                }
                cur.next=pre;
                pre=cur;
                cur=next;
            }
            return newHead;
        }
    }
}
