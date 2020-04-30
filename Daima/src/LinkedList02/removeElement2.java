package LinkedList02;

public class removeElement2 {
    public class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    public Node removeElement(Node head,int val){
        if (head==null){
            return null;
        }
        Node pre=head;
        Node cur=head.next;
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
