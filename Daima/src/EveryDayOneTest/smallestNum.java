package EveryDayOneTest;

import java.util.Scanner;

public class smallestNum {
    public class Main{
        public  void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int []a=new int[10];
            for (int i = 0; i <10 ; i++)
                a[i] = scanner.nextInt();
                for (int i = 0; i <10 ; i++) {
                    if (a[i]!=0){
                        System.out.print(i);
                        a[i]--;
                        break;
                }
                    }
                for (int i = 0; i <10 ; i++) {
                    for (int j = 1; j <=a[i] ; j++) {
                        System.out.print(i);
                    }
                }
            }
        }
    }
