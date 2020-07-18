package EveryDayOneTest;

import java.util.HashSet;
import java.util.Set;

public class FindNum_1 {
    public class Main{
        public Integer FindNum_1(int[]arr){
            Set<Integer> set=new HashSet<Integer>();
            for (int i:arr){
                if (!set.add(i)){
                    set.remove(i);
                }
            }
            if (set.size()==0){
                return null;
            }
            return set.toArray(new Integer[set.size()])[0];
        }
    }
}
