package sumTest;

public class removeElment {
    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    public  Node remove(Node head,int val){
        if (head==null){
            return null;
        }
        Node pre=head;
        Node cur=head.next;
        while (cur!=null){
            if (cur.val==val){
                pre.next=cur.next;
                cur=pre.next;
            }
        }
        if (head.val==val){
            head=head.next;
        }
        return head;
    }
}
