package EveryDayOneTest;


import java.util.ArrayList;
//通过
//顺时针打印矩阵
//■题目描述
//对于一个矩阵，请设计一个算法从左上角(mat[0][0])开始，顺时针
//打印矩阵元素。
//给定int矩阵mat,以及它的维数nxm,请返回一个数组，数组中的
//元素为矩阵元素的顺时针输出。
//测试样例:
//[[1,2], [3,4]],2,2
//返回: [1,2,4,3]
public class shunShiZhenPrint {
    public int[] clockwisePrint(int[][] mat, int n, int m) {
        // write code here
        int[] arrayList = new int[n * m];
        int k = 0;
        for (int s = 0; s * 2 < m && s * 2 < n; s++) {
            int endx = m - 1 - s;
            int endy = n - 1 - s;
            for (int i = s; i <= endx; i++) {
                arrayList[k++] = mat[s][i];
            }
            if (s < endy) {
                for (int i = s + 1; i <= endy; ++i) {
                    arrayList[k++] = mat[i][endx];
                }
                if (s < endx && s < endy) {
                    for (int i = endx - 1; i >= s; --i) {
                        arrayList[k++] = mat[endy][i];
                    }
                    if (s < endx && s < endy - 1) {
                        for (int i = endy - 1; i >= s + 1; --i) {
                            arrayList[k++] = mat[i][s];
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}



