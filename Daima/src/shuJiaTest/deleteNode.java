package shuJiaTest;

public class deleteNode {
    //删除指定值
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode deleteInterVal(ListNode head,int val){
        if (head==null){
            return null;
        }
        ListNode pre=head;
        ListNode cur=head.next;
        while (cur!=null){
            if (cur.val==val){
                pre.next=cur.next;
                cur=pre.next;
            }else {
                pre=cur;
                cur=cur.next;
            }
        }
        if (head.val==val){
            head=head.next;
        }
        return head;
    }
}
