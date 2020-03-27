package Test;

import java.util.Stack;
//翻转一个字符串
public class MianShiTi {
    public static void main(String[] args) {
        String str="ABC123ABC";
        char[] charArray=str.toCharArray();
        Stack<Character>stack=new Stack<>();
        StringBuilder newStr=new StringBuilder();
        for (char item:charArray){
            stack.push(item);
        }
        for (int i=0;i<charArray.length;i++){
            newStr.append(stack.pop());
        }
        System.out.println("反转前"+str);
        System.out.println("反转后"+newStr.toString());
    }
}
