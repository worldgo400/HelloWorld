package LinkedList02;

public class middleNode02 {
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
        for (int i=0;i<steps;i++){
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

}
