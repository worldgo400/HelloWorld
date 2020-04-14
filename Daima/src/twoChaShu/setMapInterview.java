package twoChaShu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class setMapInterview {
    public int singleNumber(int[]nums){
        Map<Integer,Integer>map=new HashMap<>();
        for (int x:nums){
            Integer value=map.get(x);
            if (value==null){
                map.put(x,1);
            }else {
                map.put(x,value+1);
            }
        }
       for (Map.Entry<Integer,Integer> entry:map.entrySet()){
           if (entry.getValue().equals(1)){
               return entry.getKey();
           }
        }
       return 0;
    }
//    public int singleNumber(int[]array){
//        int ret=0;
//        for (int x:array){
//            ret^=x;
//        }
//        return ret;
//    }

    public static void main(String[] args) {
        setMapInterview interview=new setMapInterview();
        int[]array={1,1,2,2,4,5};
        int result=interview.singleNumber(array);

        System.out.println(Arrays.toString(array));
    }
}
