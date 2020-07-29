package shuJiaTest;

public class Test0729 {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    //删除链表中值相同的节点
  ListNode deleteDuoLocation(ListNode pHead){
        if (pHead==null){
            return null;
        }
        ListNode newHead=new ListNode(-1);
        ListNode newTail=newHead;

        ListNode cur=pHead;
        while (cur!=null){
            ListNode next=cur.next;
        if (cur.next!=null&&cur.val==next.val){
           while (cur.next!=null&&cur.val==next.val){
            cur=cur.next;
        }
           cur=cur.next;

        }else {
            newTail.next=new ListNode(cur.val);
            newTail=newTail.next;
            cur=cur.next;
        }
        }
        return newHead.next;
  }
public boolean chKPalindrome(ListNode A){
        int size=size(A)/2;
        ListNode B=A;
    for (int i = 0; i <size ; i++) {
        B=B.next;//该循环结束，B就指向A的中间节点
    }
    ListNode pre=null;
    ListNode cur=B;
   while (cur!=null){
       ListNode next=cur.next;
       if (next==null){
           B=cur;
       }
     cur.next=pre;
       pre=cur;
       cur=next;
   }
   while (B!=null){
       if (A.val!=B.val){
           return false;
       }
       A=A.next;
       B=B.next;
   }
   return true;
}

    private int size(ListNode head) {
        int size=0;
        ListNode cur=head;
        while (cur!=null){
            size++;
            cur=cur.next;
        }
        return size;
    }
}
