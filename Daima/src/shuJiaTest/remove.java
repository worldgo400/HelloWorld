package shuJiaTest;

public class remove {
    int[]datas=new int[100];
    int size=0;
    public int search(int toFind){
        for (int i = 0; i < size; i++) {
               if (datas[i]==toFind){
                   return i;
               }
        }
        return -1;
    }
    public void remove(int remove){
        int pos=search(remove);
        if (pos==-1){
            return;
        }
        if (pos==size-1){
            size--;
            return;
        }
        for (int i = pos; i <size-1 ; i++) {
         datas[i]=datas[i+1];
        }
        size--;
    }
}
