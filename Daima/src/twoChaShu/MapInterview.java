package twoChaShu;

import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

public class MapInterview {
    static class Node{
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head){
        Map<Node,Node>map=new HashMap<>();
        for (Node cur=head;cur!=null;cur=cur.next){
            map.put(cur,new Node(cur.val));
        }
        for (Node cur=head;cur!=null;cur=cur.next){
                Node newCur=map.get(cur);
                newCur.next=map.get(cur.next);
                newCur.random=map.get(cur.random);
        }
        return map.get(head);
    }
}
