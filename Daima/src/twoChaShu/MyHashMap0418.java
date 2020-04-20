package twoChaShu;

public class MyHashMap0418 {
    public static class   Node{
        public int key;
        public int value;

        public Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private static final double LOAD_FACTOR=0.75;
     private Node[]array=new Node[101];
     private int size=0;
     private int hashFunc(int key){
         return key%array.length;
     }
     public void put(int key,int value){
         int index=hashFunc(key);
         Node list=array[index];
         for (Node cur=list;cur!=null;cur=cur.next){
             if (cur.key==key){
                 cur.value=value;
                 return;
             }
         }
         Node newNode=new Node(key, value);
         newNode.next=list;
         array[index]=newNode;
         size++;
         if (size/array.length>LOAD_FACTOR){
             resize();
         }
     }
     private void resize(){
         Node[]newArray=new Node[array.length*2];
         for (int i=0;i<array.length;i++){
             for (Node cur=array[i];cur!=null;cur=cur.next){
                 int index=cur.key%newArray.length;
                 Node newNode=new Node(cur.key,cur.value);
                 newNode.next=newArray[index];
                 newArray[index]=newNode;
             }
         }
         array=newArray;
     }
     public Integer get(int key){
         int index=hashFunc(key);
         Node list=array[index];
         for (Node cur=list;cur!=null;cur=cur.next){
             if (cur.key==key){
                 return cur.value;
             }
         }
         return null;
     }

}
