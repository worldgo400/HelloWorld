package EveryDayOneTest;

import java.util.Scanner;

public class aoBaMa {
        public class Main{
            public void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                int n=scanner.nextInt();
                String c=scanner.next();
                for (int i=0;i<=n;i++){
                    System.out.print(c);
                }
                System.out.println();
                for (int i=1;i<=Math.ceil((double)n/2-2);i++){
                    System.out.print(c);
                    for (int j=2;j<=n;j++){
                        System.out.print(" ");
                    }
                    System.out.println(c);
                }
                for (int i=1;i<=n;i++){
                    System.out.print(c);
                }
            }
        }
}
