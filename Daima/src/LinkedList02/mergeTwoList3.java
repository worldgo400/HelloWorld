package LinkedList02;

public class mergeTwoList3 {
    public class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    public Node mergeTwoList(Node pHead,int x){
        if (pHead==null){
            return null;
        }
        if (pHead.next==null){
            return pHead;
        }
        Node bigHead=new Node(-1);
        Node bigTail=bigHead;
        Node smallHead=new Node(-1);
        Node smallTail=smallHead;
        for (Node cur=pHead;cur!=null;cur=cur.next){
            if (cur.val<x){
                smallTail.next=new Node(cur.val);
                smallTail=smallTail.next;
            }else {
                bigTail.next=new Node(cur.val);
                bigTail=bigTail.next;
            }
        }
        smallTail.next=bigTail.next;
        return smallTail.next;
    }
}
