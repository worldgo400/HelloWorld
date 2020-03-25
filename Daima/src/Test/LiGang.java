package Test;

public class LiGang {
    public LiGang(){
        System.out.println("我会开车");
    }
}
class LiXiaoGang extends LiGang{
    public LiXiaoGang(){
        System.out.println("我长得帅");
        System.out.println("我还能一幢幢两个破凉");

    }
}
 class Main{
    public static void main(String[] args) {
        LiXiaoGang Z=new LiXiaoGang();

    }
}
