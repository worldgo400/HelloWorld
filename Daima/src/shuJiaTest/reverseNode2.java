package shuJiaTest;

public class reverseNode2 {
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode reverseNode(ListNode head){
        if (head == null) {
            return null;
        }
        if (head.next==null){
            return head;
        }
        ListNode newHead=null;
        ListNode cur=head;
        ListNode pre=null;
        while (cur!=null){

            if (cur.next==null){
                return newHead=cur;
            }
            cur.next=pre;
            pre=cur;
            cur=cur.next;

        }
        return newHead;
    }
}
