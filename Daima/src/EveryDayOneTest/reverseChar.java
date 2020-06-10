package EveryDayOneTest;

public class reverseChar {
    int[] ret = new int[100];
    int size = 0;

    public int size(int n) {
        for (int i = 0; i < n; i++) {
            size++;
        }
        return size;
    }

    public int[] reverseChar() {
        int[] chars = reverseChar();
        return chars;
    }

    public reverseChar(int[] n) {
        for (int m = 0; m < size; m++) {
            int pre = n[m];
            int cur = n[m + 1];
            int tmp;
            tmp = cur;
            cur = pre;
            pre = tmp;

        }
        return ;
    }

}
