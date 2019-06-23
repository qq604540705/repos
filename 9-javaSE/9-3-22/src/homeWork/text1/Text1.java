package homeWork.text1;

/*第一题:
		定义一个接口Animal,包含:
			1.抽象方法: run()
			2.默认方法: breathe(),输出"动物会呼吸",同时调用静态方法 eat(),私有方法: sleep()
			3.静态方法: eat(),输出"动物都要吃东西"
			4.私有方法: sleep(),输出"动物都要休息"

		定义Dog类实现Animal接口,实现抽象方法run(),输出"狗跑得飞快"
		在测试类中创建Dog类的对象d,通过对象调用run()方法和breathe()方法,打印出如下效果:
			狗跑得飞快
			动物会呼吸
			动物都要吃东西
			动物都要休息*/
public class Text1 {
}

interface Animal {
    //    1.抽象方法: run()
    abstract void run();

    //    2.默认方法: breathe(),输出"动物会呼吸",同时调用静态方法 eat(),私有方法: sleep()
    default void breathe() {
        System.out.println("动物会呼吸");
        eat();
        sleep();
    }

    //    3.静态方法: eat(),输出"动物都要吃东西"
    static void eat() {
        System.out.println("动物都要吃东西");
    }

    //    4.私有方法: sleep(),输出"动物都要休息"
    private void sleep() {
        System.out.println("动物都要休息");
    }
}
