package EveryDayOneTest;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String[] ins = in.split(" ");
        for (int i = 0; i < ins.length; i++) {
            int sum = 0;
            for (int j = 0; j < ins.length; j++) {
                if (ins[i].equals(in)) {
                    sum++;
                }
                int s = ins.length / 2;
                if (sum >= s) {
                    System.out.println(ins[i]);
                    break;
                }
            }
        }
    }
}