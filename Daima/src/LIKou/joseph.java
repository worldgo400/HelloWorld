package LIKou;
import java.util.*;
public class joseph {
    public class Joseph {
        public int getResult(int n) {
            LinkedList<Integer>res=new LinkedList<Integer>();
            int round=2,i=0,curr=0;
            for (i=1;i<=n;i++){
                res.add(i);
            }
            while (res.size()>1){
                i=0;
                while (res.size()>1&&i<res.size()){
                    curr=(curr+1)%round;
                    if (curr!=1){
                        res.remove(i);
                    }else {
                        i++;
                    }
                }
                round++;
                curr=0;
                if (res.size()>1){
                    int last=res.removeLast();
                    res.addFirst(last);
                }
            }
            return res.pop();
        }
    }
}
