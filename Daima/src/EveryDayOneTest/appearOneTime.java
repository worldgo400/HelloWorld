package EveryDayOneTest;

import java.util.Scanner;

public class appearOneTime {
    public class Main {

        public  Integer Find_num1(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                int count = 1;
                for (int j = 0; j < arr.length; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                    if (count == 1) {
                        return arr[i];
                    }

                }
            }
            return null;
        }
    }
}
