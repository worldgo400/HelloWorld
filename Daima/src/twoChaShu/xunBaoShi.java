package twoChaShu;

import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class xunBaoShi {
//    寻宝石
    public int numJewelsInStone(String J,String S){
        Set<Character>set=new HashSet<>();
        for (char c:J.toCharArray()){
            set.add(c);
        }
        int ret=0;
        for (char c:S.toCharArray()){
            if (set.contains(c)){
                ret++;
            }
        }
        return ret;
    }
}
