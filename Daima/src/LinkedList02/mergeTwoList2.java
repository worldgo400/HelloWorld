package LinkedList02;

public class mergeTwoList2 {
    public class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    public Node mergeTwoList(Node n1,Node n2){
        if (n1==null){
            return n2;
        }
        if (n2==null){
            return n1;
        }
        Node newHead=new Node(-1);
        Node newTail=newHead;
        Node cur1=n1;
        Node cur2=n2;
        while (cur1!=null&&cur2!=null){
            if (cur1.val<cur2.val){
                newTail.next=cur1;
                cur1=cur1.next;
                newTail=newTail.next;
            }else {
                newTail.next=cur2;
                cur2=cur2.next;
                newTail=newTail.next;
            }
        }
        if (cur1==null){
            newTail.next=cur2;
        }
        if (cur2==null){
            newTail.next=cur1;
        }
        return newHead.next;

    }
}
