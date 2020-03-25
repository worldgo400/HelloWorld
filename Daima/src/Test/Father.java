package Test;

public class Father {
    public static void   StaticMethod(){
        System.out.println("巴巴，我是父类巴巴的静态方法");
    }
}
class Son extends Father{
    public  static void StaticMethod(){
        System.out.println("熊孩子：我是子类熊孩子的静态方法");
    }
}
class Test{
    public static void main(String[] args) {
        Father father=new Father();
        Father son=new Son();
        father.StaticMethod();
        son.StaticMethod();
    }
}
