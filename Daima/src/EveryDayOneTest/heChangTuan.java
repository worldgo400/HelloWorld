package EveryDayOneTest;

import java.util.Scanner;

public class heChangTuan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]nums=new int[n];
        for (int i = 0; i <n ; i++) {
            nums[i]=scanner.nextInt();
        }
        int k=scanner.nextInt();
        int d=scanner.nextInt();
        long [][]max=new long[k][n];
        long[][]min=new long[k][n];
        for (int i = 0; i <k ; i++) {
            for (int j = 0; j <n ; j++) {
                max[i][j]=1;
                if (i==0){
                    min[i][j]=nums[j];
                    max[i][j]=nums[j];
                }
            }
            for (int q = 1; q <k ; q++) {
                for (int j = 0; j <n  ; j++) {
                    for (int m = 1; m <=d ; m++) {
                        if (j-m>=0){
                            if (nums[j]>0){
                                min[q][j]=Math.min(min[q][j],min[q-1][j-m]*nums[j]);
                                max[q][j]=Math.max(max[q][j],max[q-1][j-m]*nums[j]);

                            }else {
                                min[q][j]=Math.min(min[q][j],min[q-1][j-m]*nums[j]);
                                max[q][j]=Math.max(max[q][j],max[q-1][j-m]*nums[j]);
                            }
                        }
                    }
                    long Max=0;
                    for (int p = 0; p <n ; p++) {
                        Max=Math.max(Max,max[k-1][p]);
                    }
                    System.out.println(Max);
                }
            }
        }
    }
}
