package twoChaShu;

import java.util.*;

public class topK {
    static class MyComparator implements Comparator<String>{
        private Map<String,Integer>map;

        public MyComparator(Map<String, Integer> map) {
            this.map = map;
        }

        @Override
        public int compare(String t1, String t2) {
            int count1=map.get(t1);
            int count2=map.get(t2);
            if (count1==count2){
                return t1.compareTo(t2);
            }
            return count2-count1;
        }
    }
    public List<String>topKFrequent(String[]worlds,int k){
        Map<String,Integer>map=new HashMap<>();
        for (String s:worlds){
            Integer count=map.getOrDefault(s,0);
            map.put(s,count+1);
        }
        ArrayList<String>arrayList=new ArrayList<>(map.keySet());
        Collections.sort(arrayList,(t1,t2)->{
            int count1=map.get(t1);
            int count2=map.get(t2);
            if (count1==count2){
                return t1.compareTo(t2);
            }
            return count2-count1;
        });
        return arrayList.subList(0,k);
    }

}
