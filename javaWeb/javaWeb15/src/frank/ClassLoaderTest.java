package frank;

import org.junit.Test;

import java.io.InputStream;

public class ClassLoaderTest {
    @Test
    public void  t1(){
        //通过class获取资源或io流；以当前class编译类的路径作为相对位置
        InputStream is =this.getClass().getResourceAsStream("data/随便");
        System.out.println(is);
     //通过classloader获取资源或io流；以整个项目变异的根路径作为相对位置
        //项目一般通过相对路径获取
        InputStream is2=this.getClass().getClassLoader().getResourceAsStream("data/随便");
        System.out.println(is2);
    }
}
