package twoChaShu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestLambda0418 {
     class MyComp implements Comparator<Integer>{
        @Override
        public int compare(Integer O1, Integer O2) {
            return O2-O1;
        }
    }
    interface TwoIntParamReturnInt{

        Integer func(Integer a,Integer b);
    }
    public static class TestLambda{
        public static void main(String[] args) {
          ArrayList<Integer>arrayList=new ArrayList<>();
          arrayList.add(9);
          arrayList.add(5);
          arrayList.add(2);
          arrayList.add(7);
          String str="test";
            Collections.sort(arrayList,(o1,o2)->{
                System.out.println(str);
                return o2-o1;
            });
            System.out.println(arrayList);
        }
    }
}
