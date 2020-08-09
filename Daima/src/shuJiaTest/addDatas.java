package shuJiaTest;

public class addDatas {
    private int[]datas=new int[100];
    int size=0;
    public void add(int pos,int data){
    if (pos<0||pos>size){
        return;
    }
    if (size>=datas.length){
      int[]newDatas=new int[2*datas.length];
        for (int i = 0; i <datas.length ; i++) {
            newDatas[i]=datas[i];
        }
        datas=newDatas;
    }
    if (pos==size){
    datas[pos]=data;
    size++;
    return;
    }
        for (int i = size-1; i >=pos; i--) {
datas[i+1]=datas[i];
        }
        datas[pos]=data;
        size++;
    }
}
