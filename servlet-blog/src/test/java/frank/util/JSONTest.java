package frank.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JSONTest {
    //模拟HTTP接收HTTP请求的json数据：把json格式解析/反序列化为Java对象
    //响应HTTP的json格式数据：吧Java对象封装/序列化为json数据类型
    //使用Jackson框架做json的序列化/反序列化

    @Test
    public void t1() throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        Map<String,String>map=new HashMap<>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        String s=mapper.writeValueAsString(map);
        System.out.println(s);
        Map m=mapper.readValue(s,Map.class);
        System.out.println(m );
    }
}
