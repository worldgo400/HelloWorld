package shuJiaTest;

public class middleNode {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode middleNode(ListNode head){
        int steps=size(head)/2;
        ListNode cur=head;
        for (int i = 0; i <steps ; i++) {
            cur=cur.next;
        }
        return cur;
    }
    public int size(ListNode head){
    int size=0;
    ListNode cur=head;
    while (cur!=null){
        size++;
        cur=cur.next;
    }
    return size;
    }
  public ListNode findKThToTail(ListNode head,int k){
        if (head==null){
            return null;
        }
  int size=size(head);
        if (k<=0||k>size){
            return null;
        }
        int steps=size-k;
        ListNode cur=head;
      for (int i = 0; i <steps ; i++) {
         cur=cur.next;
      }
      return cur;
  }
}
