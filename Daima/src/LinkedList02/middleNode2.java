package LinkedList02;

public class middleNode2 {
    public class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
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
    public Node findMiddleNode(Node head){
      int size=size(head);
      int steps=size/2;
      Node cur=head;
      for (int i=0;i<steps;i++){
          cur=cur.next;
      }
      return cur;
    }
}
