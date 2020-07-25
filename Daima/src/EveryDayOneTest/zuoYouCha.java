package EveryDayOneTest;

public class zuoYouCha {
    public class MaxGap {
        public int findMaxGap(int[] A, int n) {
            // write code here
            int max=0;
            for(int i=0;i!=n;i++){
                max=Math.max(max,A[i]);
            }
            int min=Math.min(A[0],A[n-1]);
            return max-min;
        }
    }
}
