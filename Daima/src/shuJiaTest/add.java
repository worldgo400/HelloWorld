package shuJiaTest;
   class Node {
    public int data;
    public Node next = null;

    public Node(int data) {
        this.data = data;
    }

}
public  class add{
     Node head=null;
   public void addFist(int data){
   Node node=new Node(data);
       if (head==null){
          head=node;
          return;
   }
       node.next=head;
       head=node;
   }
   public void addLast(int data){
       Node head=null;
       Node node=new Node(data);
   if (head==null){
       head=node;
       return;
   }
  Node tail=head;
   while (tail.next==null){
       tail=tail.next;
   }
   tail.next=node;
   }
}
