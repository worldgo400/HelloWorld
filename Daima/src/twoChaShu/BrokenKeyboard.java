package twoChaShu;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BrokenKeyboard {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String expected=scanner.next();
            String actual=scanner.next();

            expected=expected.toUpperCase();
            actual=actual.toUpperCase();

            Set<Character>actualSet=new HashSet<>();
            for (int i=0;i<actual.length();i++){
               actualSet.add(actual.charAt(i));
            }
            Set<Character>brokenKeySet=new HashSet<>();
            for (int i=0; i<expected.length();i++){
                char c=expected.charAt(i);
                if (actualSet.contains(c)){
                    continue;
                }
//                这里要考虑一个坏键去重的问题
                if (brokenKeySet.contains(c)){
                    continue;
                }
//                这里要注意输出格式，不要空格
                System.out.print(c);
                brokenKeySet.add(c);
            }

        }

    }
}
