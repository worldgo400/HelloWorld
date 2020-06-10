package EveryDayOneTest;

import java.util.Scanner;

public class buyApple {
    public static class Main {

        public static void main(String[] arg) {
            Scanner scan = new Scanner(System.in);
            while (scan.hasNext()) {
                int n = scan.nextInt();
                System.out.println(solve(n));
            }
            scan.close();
        }

        public static int solve(int n) {
            int ans = 0;
            while (n >= 6) {
                if (n % 8 == 0) {
                    ans += (n >> 3);
                    n = 0;
                } else {
                    n -= 6;
                    ++ans;
                }
            }
            return n == 0 ? ans : -1;
        }
    }
}
