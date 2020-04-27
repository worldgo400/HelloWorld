package LinkedList02;

import com.sun.security.auth.NTSidUserPrincipal;

public class findKthToTail2 {
    public class Node{
        int val;
        Node next;
        public Node(int val){this.val=val;}
    }
    public int size(Node head){
        int size=0;
        Node cur=head;
        while (cur!=null){
            size++;
            cur=cur.next;
        }
        return size;
    }
    public Node findKthToTail(Node head,int k){
        if (head==null){
            return null;
        }
        int size=size(head);
        if (k<=0||k>size){
            return null;
        }
        int steps=size-k;
        Node cur=head;
        for (int i=0;i<steps;i++){
            cur=cur.next;
        }
        return cur;
    }
}
