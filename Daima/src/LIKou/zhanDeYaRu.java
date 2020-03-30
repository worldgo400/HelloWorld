package LIKou;
import java.util.ArrayList;
import java.util.Stack;
public class zhanDeYaRu {

    public class Solution {
        public boolean IsPopOrder(int[] pushA, int[] popA) {
            if (pushA==null||popA==null||pushA.length==0||popA.length==0||pushA.length!=popA.length){
                return false;
            }
            Stack<Integer>stack=new Stack<>();

            int j=0;
            for (int i=0;i<pushA.length;i++){
                stack.push(pushA[i]);
                while (!stack.isEmpty()&&stack.peek()==popA[j]){
                    stack.pop();
                    j++;
                }
            }
            return stack.isEmpty();

        }
    }
}
