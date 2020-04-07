package LinkedList02;

public class partition {
//    以给定值x为基准将链表分割成两部分
//    所有小于x的节点排在大于或等于x的节点之前
    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode partition(ListNode pHead,int x){
        if (pHead==null){
            return null;
        }
        if (pHead.next==null){
            return pHead;
        }
        ListNode bigHead=new ListNode(-1);
        ListNode bigTail=bigHead;
        ListNode smallHead=new ListNode(-1);
        ListNode smallTail=smallHead;
    for (ListNode cur=pHead;cur!=null;cur=cur.next){
        if (cur.val<x){
            smallTail.next=new ListNode(cur.val);
            smallTail=smallTail.next;
        }else {
            bigTail.next=new ListNode(cur.val);
            bigTail=bigTail.next;
        }
    }
    smallTail.next=bigHead.next;
    return smallHead.next;
    }
}
