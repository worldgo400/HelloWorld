package LinkedList02;

public class deleteDuplication2 {
    public class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    public Node deleteDuplication(Node pHead){
        Node newHead=new Node(-1);
        Node newTail=newHead;
        Node cur=pHead;
        while (cur!=null){
            if (cur.next!=null&&cur.val==cur.next.val){
                while (cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
                cur=cur.next;
            }else {
                newTail.next=new Node(cur.val);
                newTail=newTail.next;
                cur=cur.next;
            }
        }
        return newHead.next;
    }
}
