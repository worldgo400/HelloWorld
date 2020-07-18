package frank.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class JSONUtil {
    private static   volatile  ObjectMapper MAPPER;
    private static ObjectMapper getMAPPER(){
      if (MAPPER==null){
          synchronized (JSONUtil.class){
              if (MAPPER==null){
                  MAPPER=new ObjectMapper();

              }
          }
      }
      return MAPPER;
    }
    //对象序列化为json字符串
    public static    String serialize(Object o){

        try {
            return getMAPPER().writeValueAsString(o);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("序列化对象出错"+o,e);
        }
    }
    //反序列化输入流中的json字符串为Java对象
    public <T>  T deserialize(InputStream is,Class<T>valueType){
        try {
            return getMAPPER().readValue(is,valueType);
        } catch (IOException e) {
            throw new RuntimeException("反序列化json字符串出错",e);
        }
    }
}
