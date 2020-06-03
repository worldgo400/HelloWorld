package EveryDayOneTest;

import java.util.Scanner;

public class findMostLongInChars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String in=sc.nextLine();
                System.out.println(maxMum(in));
            }
     sc.close();
        }

    private static String maxMum(String in) {
        int max=0;
        String result="";
        int cur=0;
        for (int i=0;i<in.length();i++){
            char c=in.charAt(i);
            if (c>='0'&&c<='9'){
                cur++;
                if (max<cur){
                    max=cur;
                    result=in.substring(i-max+1,i+1);
                }else if (max==cur){
                    result+=in.substring(i-max+1,i+1);
                }
            }else {
                cur=0;
            }
        }
        return result+","+max;
    }
}
