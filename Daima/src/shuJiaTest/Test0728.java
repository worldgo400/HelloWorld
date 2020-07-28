package shuJiaTest;

public class Test0728 {
    //合并两个链表
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public  ListNode mergeTwoLists(ListNode t1,ListNode t2){
        if (t1==null){
            return t2;
        }
        if (t2==null){
            return t1;
        }
        ListNode newHead=new ListNode(-1);
        ListNode newTail=newHead;
        ListNode cur1=t1;
        ListNode cur2=t2;
        while (cur1!=null&&cur2!=null){
            if (cur1.val<cur2.val){
                newTail.next=cur1;
                newTail=newTail.next;
                cur1=cur1.next;
            }else {
                newTail.next=cur2;
                newTail=newTail.next;
                cur2=cur2.next;
            }
        }
        if (cur1==null){
            newTail.next=cur2;
        }
        if (cur2==null){
            newTail.next=cur1;
        }
        return newHead;


    }
    public ListNode partition(ListNode pHead,int x){
      if (pHead==null){
          return null;
      }
      if (pHead.next==null){
          return  pHead;
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
