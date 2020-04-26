package LinkedList02;

public class chkPalindrome2 {
    public static class Node{
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
    public boolean chkPalindrome2(Node A){
        int size=size(A);
        int steps=size/2;
        Node B=A;
        for (int i=0;i<steps;i++){
            B=B.next;
        }
        Node pre=null;
        Node cur=B;
      while (cur!=null){
          Node next=cur.next;
          if (next==null){
              B=cur;
          }
          cur.next=pre;
          pre=cur;
          cur=next;
      }
      while (B!=null){
          if (A.val!=B.val){
              return false;
          }
          A=A.next;
          B=B.next;
      }
      return true;
    }
    public static class Node1{
        int val;
        Node1 next;

        public Node1(int val) {
            this.val = val;
        }
    }
    public int size1(Node1 head){
        int size=0;
        Node1 cur=head;
        while (cur!=null){
            size++;
            cur=cur.next;
        }
        return size;
    }
    public boolean chlPalindrome2(Node1 A){
        int size=size1(A);
        int steps=size/2;
        Node1 B=A;
        for (int i=0;i<steps;i++){
         B=B.next;
        }
        Node1 pre=null;
        Node1 cur=B;
        while (cur!=null){
            Node1 next=cur.next;
            if (next==null){
                B=cur;
            }
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        while (B!=null){
            if (A.val!=B.val){
                return false;
            }
            A=A.next;
            B=B.next;
        }
        return true;
    }
}
