package EveryDayOneTest;

import java.util.Scanner;
//日期转换
//运行通过
public class countDays {
    public class Main1 {

        public  void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                int year = scanner.nextInt();
                int month = scanner.nextInt();
                int day = scanner.nextInt();
                countDays(year, month, day);
            }
        }

        public void countDays(int year, int month, int day) {
            int sum = 0;
            switch (month - 1) {
                case 11:
                    sum += 30;
                case 10:
                    sum += 31;
                case 9:
                    sum += 30;
                case 8:
                    sum += 31;
                case 7:
                    sum += 31;
                case 6:
                    sum += 30;
                case 5:
                    sum += 31;
                case 4:
                    sum += 30;
                case 3:
                    sum += 31;
                case 2:
                    if (isRunNian(year)) {
                        sum += 29;
                    } else {
                        sum += 28;
                    }
                case 1:
                    sum += 31;
            }
            sum += day;
            System.out.println(sum);
        }

        public  boolean isRunNian(int year) {
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
