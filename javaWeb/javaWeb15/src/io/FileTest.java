package io;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileTest {
    @Test
    public void t1() {
        File file = new File("D:\\HelloWorld\\javaWeb\\javaWeb15\\data\\随便");
        System.out.println(file.exists());
        File f2 = new File("../data/随便");
        System.out.println(f2.exists());
        File f3 = new File("data/随便");//file写相对路径不建议在真是项目中使用
        System.out.println(f3.exists());//文件是否存在
        System.out.println(f3.getPath());//获取路径
        System.out.println(f3.getAbsolutePath());//获取绝对路径
        System.out.println(f3.lastModified());//上次修改时间
    }

    @Test
    public void t2() {
        File f5 = new File("D:\\HelloWorld\\javaWeb\\javaWeb15");
        File[] children = f5.listFiles();
        for (File child : children) {
            System.out.println(child.getName());
        }
    }

    public static List<File> list(File f) {
        List<File> files = new ArrayList<>();
        if (f.isFile()) {
            files.add(f);
        } else {
            File[] children = f.listFiles();
            for (File child : children) {
                List<File> subs = list(child);
                files.addAll(subs);
            }
        }
        return files;
    }

    @Test
    public void t3() {
        File f5 = new File("D:\\HelloWorld\\javaWeb");
        List<File> children = list(f5);
        for (File child : children) {
            System.out.println(child.getName());
        }
    }
}

