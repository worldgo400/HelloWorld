package EveryDayOneTest;

import jdk.nashorn.api.tree.ForInLoopTree;

import java.util.Scanner;

public class deleteCommonString {
    class Main{
        public  void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[]strings=new String[2];
            String first = "";
            String second = "";
            for (int i = 0; i <2 ; i++) {
                strings[i]=scanner.nextLine();
            }
            first=strings[0];
            second=strings[1];
            outPut(first,second);
        }
        public    void  outPut(String first,String second){
            for (int i = 0; i <second.length() ; i++) {
                String tmp=String.valueOf(second.charAt(i));
                first=first.replaceAll(tmp,"");
            }
            System.out.println(first);
        }
    }
}
