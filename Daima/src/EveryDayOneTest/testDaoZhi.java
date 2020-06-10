package EveryDayOneTest;
import java.util.Scanner;
public class testDaoZhi {

    public static class Main{
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int in=input.nextInt();
            String string=String.valueOf(in);
            String reverseStr=new StringBuffer(string).reverse().toString();
            System.out.println(reverseStr);
        }
    }
}
