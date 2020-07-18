package EveryDayOneTest;

import java.util.Stack;

public class danDIaoZhan {
    public class Main {
        public int[] danDi(int[] T) {
            int n = T.length;
            int[] res = new int[n];
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < n; i++) {

                int pop = stack.pop();
                res[pop] = i - pop;
            }
            return null;
        }

    }
}
