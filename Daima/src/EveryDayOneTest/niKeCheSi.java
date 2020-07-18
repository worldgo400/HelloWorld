package EveryDayOneTest;

import java.util.Scanner;

public class niKeCheSi {
    public class Main{
        public  void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            while (scanner.hasNext()){
                int num=scanner.nextInt();
                int n=num*num-num+1;
                StringBuilder sb=new StringBuilder();
                for (int i = n; i <=n+2*(num-1); i++) {
                    if (i!=n+2*(num-1)){
                        sb.append(i+"+");
                        i++;
                    }else {
                        sb.append(i);
                        i++;
                    }
                    System.out.println(sb);
                }
            }
        }
    }
}
