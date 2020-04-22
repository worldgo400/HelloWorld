package HomeWork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class shuJiaoJI2 {
    class Solution {
    public int[] set_intersection(HashSet<Integer>set1,HashSet<Integer>set2) {
        int[] o = new int[set1.size()];
        int index = 0;
        for (Integer s : set1) {
            if (set2.contains(s)) {
                o[index++] = s;
            }
        }

        return Arrays.copyOf(o, index);
    }
        public int[] intersection(int[] nums1, int[] nums2) {
     HashSet<Integer>set1=new HashSet<Integer>();
     for (Integer n:nums1){
         set1.add(n);
     }
     HashSet<Integer>set2=new HashSet<Integer>();
     for (Integer n:nums2){
         set2.add(n);
     }
     if (set1.size()<set2.size()){
         return set_intersection(set1,set2);
     }else {
         return set_intersection(set2,set1);
     }
        }

    }
}
