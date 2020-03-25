package Test;

public class Mather {

    public void motherSpeak() {
        System.out.println("想吃烤山药？");
    }
}
class HappyMother extends Mather {
}
//    public void motherSpeak() {
//        System.out.println("开心的妈妈说：吃，吃大块的，一火车够吗");
//    }
//}
//    public void fatherSpeak(){
//        System.out.println("开心的妈妈说：吃，吃大块的，一麻袋够吗");
//    }
//}
class SadMother extends HappyMother {
    public void tt(){
        System.out.println("ttttttt");
    }
}
//class VeryHappyMother extends Mather {
//    public void motherSpeak(){
//        System.out.println("异常开心的妈妈说：买买买，烤山药咱全买了，顺便把大爷也买回家，天天给你表演激光雨（大爷懵逼中");
//    }
//}
 class UnderstandPolymorphic{
    public static void main(String[] args) {
Mather m=new SadMother();
    m.motherSpeak();

//    m=new SadMother();
//    m.motherSpeak();
//
//    m=new VeryHappyMother();

    }
}

