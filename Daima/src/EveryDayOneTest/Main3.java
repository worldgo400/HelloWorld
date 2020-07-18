package EveryDayOneTest;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            String password = Encrypt(input);
            System.out.println(password);
            String p = scanner.next();
            String output = unEncrypt(p);
            System.out.println(output);
        }
    }

    private static String Encrypt(String input) {
        char[] inputArray = input.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            if (inputArray[i] >= 'a' && inputArray[i] <= 'z') {
                if (inputArray[i] == 'z') {
                    stringBuffer.append((char) ('a' - 32));
                } else {
                    stringBuffer.append((char) (inputArray[i] - 31));
                }
            } else if (inputArray[i] >= 'A' && inputArray[i] <= 'Z') {
                if (inputArray[i] == 'Z') {
                    stringBuffer.append((char) (inputArray[i] + 33));
                } else {
                    stringBuffer.append((char) (inputArray[i] + 33));
                }
            } else if (inputArray[i] >= '0' && inputArray[i] <= '9') {
                if (inputArray[i] == '9') {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append((char) (inputArray[i] + 1));
                }
            }
        }
        return stringBuffer.toString();
    }

    public static String unEncrypt(String input) {
        char[] inputArray = input.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] >= 'a' && inputArray[i] <= 'z') {
                if (inputArray[i] == 'a') {
                    stringBuffer.append((char) ('a' - 7));
                } else {
                    stringBuffer.append((char) (inputArray[i] - 33));
                }
            } else if (inputArray[i] >= 'A' && inputArray[i] <= 'Z') {
                if (inputArray[i] >= 'A' && inputArray[i] <= 'Z') {
                    if (inputArray[i] == 'A') {
                        stringBuffer.append((char) ('A' + 57));
                    } else {
                        stringBuffer.append((char) (inputArray[i] + 31));
                    }
                } else if (inputArray[i] >= '0' && inputArray[i] <= '9') {
                    if (inputArray[i] == '0') {
                        stringBuffer.append('9');
                    } else {
                        stringBuffer.append((char) (inputArray[i] - 1));
                    }
                }
            }
        }
            return stringBuffer.toString();
        }
    }

