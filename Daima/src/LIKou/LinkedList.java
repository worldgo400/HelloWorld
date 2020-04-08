package LIKou;

public class LinkedList {
    public void add(int i) {
    }

    public void remove(int i) {
    }

    public static class ListNode{
        int val;
        ListNode next;

          public ListNode(int val) {
              this.val = val;
          }


//          删除链表中的某个元素
          public ListNode removeElement(ListNode head,int val){
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



//          翻转一个链表
          public ListNode reverseList(ListNode head){
              if (head==null){
                  return null;
              }
              if (head.next == null) {
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
//


      }
}
