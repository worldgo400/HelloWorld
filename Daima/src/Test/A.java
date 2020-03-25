package Test;

import java.sql.SQLOutput;

public class A {
    public String show(C obj){
        return ("a and c");
    }
    public String show(A obj){
        return ("a and a");
    }
}
class B extends A{
    public String show(B obj){
        return ("b and b");
    }
}
class C extends B{
    public String show(A obj){
        return ("a and b");
    }
}
 class Demo{
     public static void main(String[] args) {
         A a=new A();
         B b=new B();
         C c=new C();
         System.out.println("第一题"+a.show(a));
         System.out.println("第二题"+a.show(b ));
         System.out.println("第三题"+a.show(c));
     }

}
