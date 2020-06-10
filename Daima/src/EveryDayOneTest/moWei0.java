package EveryDayOneTest;

import java.util.Scanner;

public class moWei0 {
    public class Main {
        public  void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
                int in = scanner.nextInt();

                    for (int i = 1; i <= in; i++) {
                        int j=i;
                        int ans=0;
                        while (j%5==0){
                            ans++;
                    }
                    System.out.println(ans);
            }
        }
    }
}
