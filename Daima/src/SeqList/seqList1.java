package SeqList;

public class seqList1 {
    private  int[]date=new int[100];
   private   int size=0;
    public void display(){
        String result="[";
        for (int i=0;i<size;i++){
            result+=date[i];
            if (i<size-1){
                result+=",";
            }
        }
        result+="]";
        System.out.println(result );
    }


    public void add(int pos,int data){
        if (pos<0||pos>size){
            return;
        }
        if (size>=date.length){
            int[]newDate=new int[2*date.length];
            for (int i=0;i<date.length;i++){
                newDate[i]=date[i];
            }
            date=newDate;
        }
        //尾插
        if (pos==size){
            date[pos]=data;
            size++;
            return;
        }
        //普通插入
        for (int i=size-1;i>=pos;i--){
            date[i+1]=date[i];
        }
        date[pos]=data;
        size++;
    }
    public boolean contains(int toFind){
        for (int i=0;i<size;i++){
            if (date[i]==toFind){
                return true;
            }
        }
        return false;
    }
    public int search(int toFind){
        for (int i=0;i<size;i++){
            if (date[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    public int getPos(int pos){
        return date[pos];
    }
    public int setPos(int pos,int data){
        return date[pos]=data;
    }
    public void remove(int toRemove){
        int pos=search(toRemove);
        if (pos==-1){
            return;
        }
        if (pos==size-1){
            size--;
            return;
        }
        for (int i=pos;i<size-1;i++){
            date[i]=date[i+1];
        }
        size--;
    }
    public void clear(){
        size=0;
    }
}
