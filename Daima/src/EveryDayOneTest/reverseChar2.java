package EveryDayOneTest;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class reverseChar2 {
    public static class Main{
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int in=input.nextInt();
            reverse(in);
            System.out.println(reverse(in));;
        }
    }

    private static int reverse(int in) {
        int s,j=0;
        s=in;
        while (s!=0){
            j=j*10+s%10;
            s=s/10;
        }
        return j;
    }

}
