package shuJiaTest;

public class bubbleSort3 {
//    冒泡排序
    public void bubbleSort(int[]arr){
        for (int bound = 0; bound <arr.length ; bound++) {
            for (int cur = 0; cur <arr.length-bound-1 ; cur++) {
                if (arr[cur]>arr[cur+1]){
                    int tmp=arr[cur];
                    arr[cur]=arr[cur+1];
                    arr[cur+1]=tmp;
                }
            }
        }
    }
}
