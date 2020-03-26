package Test.java0326;

public class MyStack {
    private int[]array=new int[100];
    private int size=0;
//    入栈
    public void push(int x){
        array[size]=x;
        size++;
    }
//    取出栈顶元素
    public int peek(){
        return array[size-1];
    }
    public int pop(){
        int ret=array[size-1];
        size--;
        return ret;
    }

}
