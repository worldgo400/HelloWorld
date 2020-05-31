package frank;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class FileIoTest {
    @Test
    public void t1() throws IOException{
        FileInputStream fis =null;
        try {
            fis=new FileInputStream("D:\\HelloWorld\\javaWeb\\javaWeb15\\data\\随便");
            byte[]bytes=new byte[1024];
            int len;
            while ((len=fis.read(bytes))!=-1){
                String s=new String(bytes,0,len);
                System.out.println(s);
            }
        } finally {
            if (fis!=null){
                fis.close();
            }
        }
    }

    @Test
    public void t2() throws IOException {
        FileReader reader = new FileReader("D:\\HelloWorld\\javaWeb\\javaWeb15\\data\\随便");
        char[] chars = new char[1024];
        int len;
        while ((len = reader.read(chars)) != -1) {
            String s = new String(chars, 0, len);
            System.out.println(s);
        }
    }
    @Test
    public void t3(){

    }
}
