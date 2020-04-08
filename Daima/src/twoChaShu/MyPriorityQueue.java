package twoChaShu;

public class MyPriorityQueue {
    private int[]arry=new int[100];
    private int size=0;
    public void offer(int x){
        arry[size]=x;
        size++;
        shiftUp(arry ,size-1);
    }

    private static void shiftUp(int[] arry, int index) {
        int child=index;
        int parent=(child-1)/2;
        while (child>0){
            if (arry[parent]<arry[child]){
                int tmp=arry[parent];
                arry[parent]=arry[child];
                arry[child]=tmp;
            }   else {
                break;
            }
            child=parent;
            parent=(child-1)/2;
        }
    }
    public int poll(){
        int oldValue=arry[0];
        arry[0]=arry[size-1];
        size--;
        shiftDown(arry,size,0);
        return oldValue;
    }

    private static   void shiftDown(int[] arry,int size,int index){
    int parent=index;
    int child=2*parent+1;
    while (child<size){
        if (child+1<size&&arry[child+1]>arry[child]){
            child=child+1;
        }
        if (arry[child]>arry[parent]){
            int tmp=arry[child];
            arry[child]=arry[parent];
            arry[parent]=tmp;
        }else {
            break;
        }
        parent=child;
        child=parent*2+1;
    }
    }
    public int peek(){
        return arry[0];
    }
    public boolean isEmpty(){return size==0;}

    public static void main(String[] args) {
        MyPriorityQueue queue=new MyPriorityQueue();
        queue.offer(9);
        queue.offer(5);
        queue.offer(2);
        queue.offer(7);
        queue.offer(3);
        queue.offer(6);
        queue.offer(8);
        while (!queue.isEmpty()){
            int cur=queue.poll();
            System.out.println(cur);
        }

    }

}
