package twoChaShu;

import java.lang.reflect.InvocationTargetException;

public class TestReflect0418 {
    class animal{
        public void eat(String food){

        }
    }
    class Cat extends animal{
        private String name;

        public Cat() {
            this.name = "小猫";
        }
        public Cat(String name){
            this.name=name;
        }

        @Override
        public void eat(String food) {
            System.out.println(this.name+"正在吃"+food);
        }
    }
    class Bird extends animal{
        private String name;

        public Bird() {
            this.name = "小鸟";
        }

        @Override
        public void eat(String food) {
            System.out.println(this.name+"正在吃"+food);
        }
        public class TestReflect{
            public void main(String[] args) throws ClassNotFoundException,IllegalAccessError,InstantiationError,NoSuchFieldException,NoSuchMethodError, InvocationTargetException {
                Class catClass=Class.forName("twoChaShu.Cat");
                Cat cat=new Cat("小黑");
                Class catClass2=cat.getClass();
                System.out.println(catClass==catClass2);

            }
        }

    }
}
