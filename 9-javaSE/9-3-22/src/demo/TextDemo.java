package demo;

/*1.创建动物类接口,实现这个接口的有狗类和狮子类
2.定义动物接口的行为,吃,狗接口的行为1.吃骨头2.游泳   狮子类1.吃狗 2.奔跑
3.要求你定义一个方法,既能接收狗对象又能接收老虎对象
4.在测试类中实现需求
* */
public class TextDemo {
    public static void main(String[] args) {
        Dog d=new Dog();
        daziran(d);
        ShiZi s=new ShiZi();
        daziran(s);
    }

//定义一个方法,既能接收狗对象又能接收老虎对象
    public static void daziran(dongwu a){
        a.eat();
//        想从父类调用子类独有方法必须向下转 父类.cast.var
//        判断 in
        if(a instanceof Dog){
            Dog dog = (Dog) a;
            dog.eat();
            dog.youyon();
        }
        if (a instanceof ShiZi){
            ShiZi shiZi = (ShiZi) a;
            shiZi.eat();
            shiZi.run();

        }
    }
}

//创建一个动物接口,里面有抽象方法,吃
interface dongwu {
    abstract void eat();
}

class Dog implements dongwu {

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    public void youyon() {
        System.out.println("狗爬式");
    }
}

class ShiZi implements dongwu {

    @Override
    public void eat() {
        System.out.println("吃狗肉");
    }

    public void run() {
        System.out.println("在奔跑");
    }
}