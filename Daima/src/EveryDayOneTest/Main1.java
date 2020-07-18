package EveryDayOneTest;

import java.awt.*;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            String str=scanner.nextLine();
            String[]strs=str.split(" ;");
            Point point=new Point();
            for (int i = 0; i <strs.length ; i++) {
                if (strs[i].length()<=3&&strs[i].length()>1){
                    if (strs[i].charAt(0)=='A'||strs[i].charAt(0)=='w'||strs[i].charAt(0)=='D'){
                        String num=strs[i].substring(1);
                        int len=num.length();
                        if (len-num.replaceAll("[^0-9]","").length()==0){
                            point=Direction(strs[i],point);
                        }
                    }
                }
            }
            System.out.println(point.x+","+point.y);
        }
    }

    private static Point Direction(String str, Point point) {
    if (str.charAt(0)=='A'){
        point.x=point.x-Integer.parseInt(str.substring(1));
    }
    if (str.charAt(0)=='W'){
        point.y=point.y+Integer.parseInt(str.substring(1));
    }
    if (str.charAt(0)=='S'){
        point.y=point.y-Integer.parseInt(str.substring(1));
    }
    if (str.charAt(0)=='D'){
        point.x=point.x+Integer.parseInt(str.substring(1));
    }
    return point;
    }
    class point{
        int x;
        int y;
    }
}
