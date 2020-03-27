package Test;

public class MianShi {
//    如何在一个字符串里知道某一个字符重复的次数
public static void main(String[] args) {
    String str="ABC123ABC";
    String searchChar="B";
    int count=0;
    int origialLength=str.length();
    str=str.replace(searchChar,"");
    int newLength=str.length();
    count=origialLength-newLength;
    System.out.println("字符"+searchChar+"出现的次数为"+count);
}
}
