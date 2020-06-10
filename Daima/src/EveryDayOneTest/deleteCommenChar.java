package EveryDayOneTest;

import java.util.HashMap;
import java.util.Scanner;

public class deleteCommenChar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        HashMap<Integer,Character>map=new HashMap<>();
        int index=0;
        for (int i=0;i<s2.length();i++){
            map.put(index,s2.charAt(i));
            index++;
        }
        for (int i=0;i<s1.length();i++){
            if (!map.containsValue(s1.charAt(i))){
                System.out.println(s1.charAt(i));
            }
        }
    }
}
