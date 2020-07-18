package EveryDayOneTest;

public class anotherSumMethod {
    public class UnusualAdd {
        public int addAB(int A, int B) {
            // write code here
            int t1, t2;
            while (B != 0) {
                t1 = (int) (A ^ B);
                t2 = (int) ((A & B) << 1);
                A = t1;
                B = t2;
            }
            return A;
        }
    }
}
