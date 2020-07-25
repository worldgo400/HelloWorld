package EveryDayOneTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class findBrother {
    //查找兄弟单词
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            String[]str1=new String[n];
            String[]str2=new String[n+1];
            for (int i = 0; i < n; i++) {
                str1[i]=sc.next();
            }
            Arrays.sort(str1);
            String s=sc.next();
            int x=sc.nextInt();
            int count=0,k=1;
            boolean ist=false;
            for (int i = 0; i <n ; i++) {
                if (!s.equals(str1[i])){
                    ist = isxiongdi(s,str1[i]);
                    if(ist){
                        count++;
                        str2[k++]=str1[i];
                    }
                }
            }
            System.out.println(count);
            if(count >= x){//判断x是否越界,我开始没有判断只有40%通过率
                System.out.println(str2[x]);
            }
        }
    }
    public static boolean isxiongdi(String str1,String str2){
        if (str1.length()!=str2.length()){
            return false;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return new String(chars1).equals(new String(chars2)) && !str1.equals(str2);
    }
}

