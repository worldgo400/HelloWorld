package EveryDayOneTest;

import java.util.Scanner;

public class qiShuiPing0601 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int count=0;
            if (n>0){
                while (n>1){
                    count=count+n/3;
                    n=n%3+n/3;
                    if (n==2){
                        n++;
                    }
                }
                System.out.println(count);
            }
        }
        in.close();
    }
}
