package util;

import Util.JASONUtil;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class jasonTest {
    @Test
    public void t1(){
        Map<String,String>map=new HashMap<>();
        map.put("1","A");
        map.put("2","B");
        map.put("3","C");
        map.put("4","D");
        System.out.println(JASONUtil.write(map));
    }
    @Test
    public void t2() throws IOException {
        InputStream is=getClass().getClassLoader().getResourceAsStream("t2.jason");
      HashMap map=JASONUtil.read(is,HashMap.class);
        System.out.println(map);
    }
}
