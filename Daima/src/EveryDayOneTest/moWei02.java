package EveryDayOneTest;
import java.util.Scanner;
public class moWei02 {

    public class Main {
        public void main(String[] args) {
            int j=0,ret=0;
            Scanner scanner = new Scanner(System.in);

            int in = scanner.nextInt();


            for (int i = 1; i <=in; i++) {
                j=i;

                while (j%5==0) {
                    ret++;
                    j/=5;
                }
            }
            System.out.println(ret);
        }

    }


}
