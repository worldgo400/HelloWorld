package EveryDayOneTest;

import java.util.Scanner;

public class tangGuo {
    public class Main {
        public void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                int s1 = sc.nextInt();
                int s2 = sc.nextInt();
                int s3 = sc.nextInt();
                int s4 = sc.nextInt();
                int a = 0;
                double tempA = ((double) s1 + s3) / 2;
                if (Double.compare(tempA, (int) tempA) == 0) {
                    a = (int) tempA;
                } else {
                    System.out.println("no");
                    continue;
                }
                int b = s3 - a;
                int c = s4 - b;
                if (b - c == s2) {
                    System.out.println(a + "" + b + "" + c);
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}

