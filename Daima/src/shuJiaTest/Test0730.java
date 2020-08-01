package shuJiaTest;

public class Test0730 {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
     public ListNode getIntersectionNode(ListNode headA,ListNode headB) {
         int size1 = size(headA);
         int size2 = size(headB);
         if (size1 > size2) {
             int offset=size1-size2;
             for (int i = 0; i < offset; i++) {
                 headA=headB.next;
             }
         }else {
             int offset=size2-size1;
             for (int i = 0; i <offset ; i++) {
                 headB=headB.next;
             }
         }
         while (headA!=null&&headB!=null){
             if (headA==headB){
                 return headA;
             }
             headA=headA.next;
             headB=headB.next;
         }
         return null;
     }

    private int size(ListNode headA) {
            int size=0;
            ListNode cur=headA;
            while (cur!=null){
            size++;
            cur=cur.next;

        }
        return size;
    }
}
