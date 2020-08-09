package shuJiaTest;

public class Main {
   public class Node{
      public int data;
       public   Node next=null;

       public Node(int data) {
           this.data = data;
       }
   }
public class LinkedNodeList{
      private Node head=null;
      public void addFirst(int data){
     Node node=new Node(data);
     if (head==null){
         return;
     }
     node.next=head;
     head=node;
      }
}
}
