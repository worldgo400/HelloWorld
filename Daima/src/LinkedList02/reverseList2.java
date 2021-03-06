package LinkedList02;

public class reverseList2 {
    public class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    public Node reverseList(Node head){
        if (head==null){
            return null;
        }
        if (head.next==null){
            return head;
        }
        Node pre=null;
        Node cur=head;
        Node newHead=null;
        while (cur!=null){
            Node next=cur.next;
            if (next==null){
                newHead=cur;
            }
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return newHead;
    }
}
