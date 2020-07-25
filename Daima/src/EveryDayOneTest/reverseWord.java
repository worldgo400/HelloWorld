package EveryDayOneTest;

import java.util.Scanner;
//单词倒排
public class reverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String sc = scanner.next();
            char[] tmp = sc.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < tmp.length; i++) {
                if ((tmp[i] >= 'a' && tmp[i] <= 'z') || (tmp[i] >= 'A' && tmp[i] <= 'Z')) {
                    stringBuilder.append(tmp[i]);
                } else {
                    stringBuilder.append(" ");
                }
            }
            String str = stringBuilder.toString();
            str = str.trim();
            String[] tmp1 = str.split("\\s+");
            for (int j = tmp1.length - 1; j >= 0; j--) {
                System.out.println(tmp1[j] + " ");
            }
            System.out.println();
        }
    }

}
