package EveryDayOneTest;

public class leagalKuoHao {
    public static void main(String[] args) {
    }
    public boolean chkParenthesis(String A, int n) {
        char[] c = A.toCharArray();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] != '(' && c[i] != ')') {
                return false;
            } else {
                if (c[i] == '(') {
                    count++;
                } else {
                    count--;
                }
                if (count < 0) {
                    return false;
                }
                if (count == 0) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
