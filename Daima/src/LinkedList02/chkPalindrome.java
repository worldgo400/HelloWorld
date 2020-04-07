package LinkedList02;

public class chkPalindrome {
    //    链表的回文结构
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public int size(ListNode head) {
        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }

     public boolean chkPalindrome(ListNode A){
//        先找到链表A的中间节点
         int size=size(A);
         int steps=size/2;
         ListNode B=A;
         for (int i=0;i<steps;i++){
             B=B.next;
         }
//         上面的循环节数后，B就指向了A的中间节点
//         从B开始，对后面的节点进行逆置
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
}
