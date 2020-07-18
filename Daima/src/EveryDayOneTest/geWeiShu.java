package EveryDayOneTest;

import java.util.Scanner;

public class geWeiShu {
    public class Main{
        public  void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String in=scanner.next();
           int[]num={0,0,0,0,0,0,0,0,0};
           for (int i=0;i<in.length();i++){
               num[in.charAt(i)-48]++;
            }
           for (int i=0;i<10;i++){
               if (num[i]!=0){
                   System.out.printf("%d:%d\n",i,num[i]);
               }
           }
        }
    }
}
