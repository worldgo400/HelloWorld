package shuJiaTest;

public class seqlist {
    public int[]datas=new int[100];
    int size=0;
    public void display() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += datas[i];

            if (i < size - 1) {
                result += ",";
            }
        }
        result = "]";
        System.out.println(result);
    }

}
