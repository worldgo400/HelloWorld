package EveryDayOneTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class faHongBao {


    public class Gift {
        public int getValue(int[] gifts, int n) {
            // write code here
            Set<Integer> set=new HashSet<Integer>();
            for(int i=0;i<n;i++){
                set.add(gifts[i]);
            }
            int i=0;
            int[]newarr=new int[set.size()];
            Iterator iterator=set.iterator();
            while(iterator.hasNext()){
                newarr[i]=(Integer)iterator.next();
                i++;
            }
            int[]result=new int[newarr.length];
            for(int j=0;j<newarr.length;j++){
                int count=0;
                for(int k=0;k<n;k++){
                    if(newarr[j]==gifts[k]){
                        count++;
                    }
                }
                result[j]=count;
            }
            for(int m=0;m<result.length;m++){
                if(result[m]>=n/2){
                    return newarr[m];
                }
            }
            return 0;
        }
    }
}
