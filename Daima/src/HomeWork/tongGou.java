package HomeWork;

import java.util.HashMap;

public class tongGou {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
      return isIsomorphicHelper(s,t)&&isIsomorphicHelper(t,s);
        }

        private boolean isIsomorphicHelper(String s, String t) {
            int n=s.length();
            HashMap<Character,Character>hashMap=new HashMap<>();
            for (int i=0;i<n;i++){
                char c1=s.charAt(i);
                char c2=t.charAt(i);
                if (hashMap.containsKey(c1)){
                    if (hashMap.get(c1)!=c2){
                        return false;
                    }
                }else {
                    hashMap.put(c1,c2);

                }
            }
            return true;
        }
    }
}
