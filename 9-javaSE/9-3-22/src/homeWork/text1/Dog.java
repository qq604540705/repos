package homeWork.text1;
/*定义Dog类实现Animal接口,实现抽象方法run(),输出"狗跑得飞快"
		在测试类中创建Dog类的对象d,通过对象调用run()方法和breathe()方法,打印出如下效果:
			狗跑得飞快
			动物会呼吸
			动物都要吃东西
			动物都要休息*/
public class Dog implements Animal {


    @Override
    public void run() {
        System.out.println("狗跑的快");
    }
}

