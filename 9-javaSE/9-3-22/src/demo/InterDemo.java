package demo;
/*
    基于JDK 1.7版本 来讲解接口!!! --> 以后百分之99的情况都是按这套规范来编写接口
        1.7版本接口中的成员:
            1.成员变量 --> 不准有
            2.成员方法 --> 不准有
            3.构造方法 --> 不准有 , 接口是不可以直接创建对象的
            4.常量  --> 可以有,
                接口中只能有自定义常量! 接口中的成员变量 默认被: public static final 修饰
                    被这3个修饰符修饰, 就是一个自定义常量~
                        自定义常量的命名规范:
                            单个单词:全部大写
                            多个单词:全部大写但是每个单词用下划线分隔
            5.抽象方法 --> 必然有的! 接口中的抽象方法 默认被:  public abstract 修饰

     关于接口的使用方式:拿一个类(子类/实现类) 去实现接口~
        1.子类实现父接口,必须重写父接口中所有的抽象方法~ 或者 把自己变成抽象类~
 */
public class InterDemo {
    public static void main(String[] args) {
        //在需要使用的地方创建实现类对象
        Zi zi = new Zi();
        zi.show();
        zi.method();
        zi.function();

        System.out.println(InterA.NUM);
        System.out.println(InterA.AUTHOR);
        System.out.println(Math.PI);
    }
}

//子类 --> 实现类
class Zi implements InterA,InterB{

    @Override
    public void show() {
        System.out.println("实现类重写的抽象方法show");
    }

    @Override
    public void method() {
        System.out.println("实现类重写的抽象方法method");
    }

    @Override
    public void function() {
        System.out.println("实现类重写的抽象方法function");
    }
}

interface InterB{
    public abstract void function();
}

//接口就定义好了~
interface InterA{
    //自定义常量~
    public static final int NUM = 100;
    public static final String AUTHOR = "谈斌";


    //抽象方法
    public abstract void show();
    public abstract void method();

    //成员变量 --> 不可以有
    //int num = 100;

    //成员方法  --> 不可以有
//    public void show(){
//        System.out.println("你好~");
//    }
    //构造方法 --> 不可以有
//    public InterA(){
//
//    }

}
