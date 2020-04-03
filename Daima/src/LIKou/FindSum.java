package LIKou;

public class FindSum {
    class Solution {
        public boolean canThreePartsEqualSum(int[] A) {
              int sum=0;
              for (int i:A){
                  sum+=i;
              }
              if (sum%3!=0){
                  return false;
              }
              int s=0;
              int t=0;
              for (int i:A){
                  s+=i;
                  if (s==sum/3){
                      t++;
                      s=0;
                  }
              }
              return t>=3;
        }
    }
}
