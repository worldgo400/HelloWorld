package LIKou;

public class FindJudge {
    class Solution {
        public int findJudge(int N, int[][] trust) {
            int[] c = new int[N + 1];
            for (int[] index : trust) {
                c[index[0]]--;
                c[index[1]]++;
            }
            for (int i = 1; i <= N; i++) {
                if (c[i] == N - 1) {
                    return i;
                }
            }
                return -1;
            }
        }
    }

