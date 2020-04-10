package twoChaShu;

import java.util.Arrays;

public class bubbleSort {
    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    public static void bubbleSort(int[]array){
        for (int bound=0;bound<array.length;bound++){
            for (int cur=array.length-1; cur>bound;cur--){
                if (array[cur-1]>array[cur]){
                    swap(array,cur-1,cur);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[]array={9,5,2,7,3,6,9};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

}
